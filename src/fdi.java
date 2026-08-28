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

public class fdi {
   static final Logger a = LogUtils.getLogger();
   final Executor b;
   final TimeUnit c;
   final azt d;

   public fdi(Executor $$0, TimeUnit $$1, azt $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public <T> fdi.e<T> a(String $$0, Callable<T> $$1, Duration $$2, fdj $$3) {
      long $$4 = this.c.convert($$2);
      if ($$4 == 0L) {
         throw new IllegalArgumentException("Period of " + $$2 + " too short for selected resolution of " + this.c);
      } else {
         return new fdi.e<>($$0, $$1, $$4, $$3);
      }
   }

   public fdi.c a() {
      return new fdi.c();
   }

   static record a<T>(Either<T, Exception> a, long b) {
   }

   class b<T> {
      private final fdi.e<T> a;
      private final Consumer<T> b;
      private long c = -1L;

      b(final fdi.e<T> $$0, final Consumer<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(long $$0) {
         this.a.a($$0);
         this.a();
      }

      void a() {
         fdi.d<T> $$0 = this.a.g;
         if ($$0 != null && this.c < $$0.b) {
            this.b.accept($$0.a);
            this.c = $$0.b;
         }
      }

      void b() {
         fdi.d<T> $$0 = this.a.g;
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
      private final List<fdi.b<?>> b = new ArrayList<>();

      public <T> void a(fdi.e<T> $$0, Consumer<T> $$1) {
         fdi.b<T> $$2 = fdi.this.new b<>($$0, $$1);
         this.b.add($$2);
         $$2.a();
      }

      public void a() {
         for (fdi.b<?> $$0 : this.b) {
            $$0.b();
         }
      }

      public void b() {
         for (fdi.b<?> $$0 : this.b) {
            $$0.a(fdi.this.d.get(fdi.this.c));
         }
      }

      public void c() {
         for (fdi.b<?> $$0 : this.b) {
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
      private final fdj e;
      @Nullable
      private CompletableFuture<fdi.a<T>> f;
      @Nullable
      fdi.d<T> g;
      private long h = -1L;

      e(final String $$1, final Callable<T> $$2, final long $$3, final fdj $$4) {
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      void a(long $$0) {
         if (this.f != null) {
            fdi.a<T> $$1 = this.f.getNow(null);
            if ($$1 == null) {
               return;
            }

            this.f = null;
            long $$2 = $$1.b;
            $$1.a().ifLeft($$1x -> {
               this.g = new fdi.d<>((T)$$1x, $$2);
               this.h = $$2 + this.d * this.e.a();
            }).ifRight($$1x -> {
               long $$2x = this.e.b();
               fdi.a.warn("Failed to process task {}, will repeat after {} cycles", new Object[]{this.b, $$2x, $$1x});
               this.h = $$2 + this.d * $$2x;
            });
         }

         if (this.h <= $$0) {
            this.f = CompletableFuture.supplyAsync(() -> {
               try {
                  T $$0x = this.c.call();
                  long $$1x = fdi.this.d.get(fdi.this.c);
                  return new fdi.a<>(Either.left($$0x), $$1x);
               } catch (Exception var4x) {
                  long $$3 = fdi.this.d.get(fdi.this.c);
                  return new fdi.a<>(Either.right(var4x), $$3);
               }
            }, fdi.this.b);
         }
      }

      public void a() {
         this.f = null;
         this.g = null;
         this.h = -1L;
      }
   }
}
