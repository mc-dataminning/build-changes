import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class foy {
   static final Logger a = LogUtils.getLogger();
   final Executor b;
   final TimeUnit c;
   final bbc d;

   public foy(Executor $$0, TimeUnit $$1, bbc $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public <T> foy.e<T> a(String $$0, Callable<T> $$1, Duration $$2, foz $$3) {
      long $$4 = this.c.convert($$2);
      if ($$4 == 0L) {
         throw new IllegalArgumentException("Period of " + $$2 + " too short for selected resolution of " + this.c);
      } else {
         return new foy.e<>($$0, $$1, $$4, $$3);
      }
   }

   public foy.c a() {
      return new foy.c();
   }

   static record a<T>(Either<T, Exception> a, long b) {
   }

   class b<T> {
      private final foy.e<T> a;
      private final Consumer<T> b;
      private long c = -1L;

      b(final foy.e<T> $$0, final Consumer<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(long $$0) {
         this.a.a($$0);
         this.a();
      }

      void a() {
         foy.d<T> $$0 = this.a.g;
         if ($$0 != null && this.c < $$0.b) {
            this.b.accept($$0.a);
            this.c = $$0.b;
         }
      }

      void b() {
         foy.d<T> $$0 = this.a.g;
         if ($$0 != null) {
            this.b.accept($$0.a);
            this.c = $$0.b;
         }
      }

      void c() {
         this.a.a();
         this.c = -1L;
      }
   }

   public class c {
      private final List<foy.b<?>> b = new ArrayList<>();

      public <T> void a(foy.e<T> $$0, Consumer<T> $$1) {
         foy.b<T> $$2 = foy.this.new b<>($$0, $$1);
         this.b.add($$2);
         $$2.a();
      }

      public void a() {
         for (foy.b<?> $$0 : this.b) {
            $$0.b();
         }
      }

      public void b() {
         for (foy.b<?> $$0 : this.b) {
            $$0.a(foy.this.d.get(foy.this.c));
         }
      }

      public void c() {
         for (foy.b<?> $$0 : this.b) {
            $$0.c();
         }
      }
   }

   static record d<T>(T a, long b) {
   }

   public class e<T> {
      private final String b;
      private final Callable<T> c;
      private final long d;
      private final foz e;
      @Nullable
      private CompletableFuture<foy.a<T>> f;
      @Nullable
      foy.d<T> g;
      private long h = -1L;

      e(final String $$1, final Callable<T> $$2, final long $$3, final foz $$4) {
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      void a(long $$0) {
         if (this.f != null) {
            foy.a<T> $$1 = this.f.getNow(null);
            if ($$1 == null) {
               return;
            }

            this.f = null;
            long $$2 = $$1.b;
            $$1.a().ifLeft($$1x -> {
               this.g = new foy.d<>((T)$$1x, $$2);
               this.h = $$2 + this.d * this.e.a();
            }).ifRight($$1x -> {
               long $$2x = this.e.b();
               foy.a.warn("Failed to process task {}, will repeat after {} cycles", new Object[]{this.b, $$2x, $$1x});
               this.h = $$2 + this.d * $$2x;
            });
         }

         if (this.h <= $$0) {
            this.f = CompletableFuture.supplyAsync(() -> {
               try {
                  T $$0x = this.c.call();
                  long $$1x = foy.this.d.get(foy.this.c);
                  return new foy.a<>(Either.left($$0x), $$1x);
               } catch (Exception var4x) {
                  long $$3 = foy.this.d.get(foy.this.c);
                  return new foy.a<>(Either.right(var4x), $$3);
               }
            }, foy.this.b);
         }
      }

      public void a() {
         this.f = null;
         this.g = null;
         this.h = -1L;
      }
   }
}
