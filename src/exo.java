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

public class exo {
   static final Logger a = LogUtils.getLogger();
   final Executor b;
   final TimeUnit c;
   final axu d;

   public exo(Executor $$0, TimeUnit $$1, axu $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public <T> exo.e<T> a(String $$0, Callable<T> $$1, Duration $$2, exp $$3) {
      long $$4 = this.c.convert($$2);
      if ($$4 == 0L) {
         throw new IllegalArgumentException("Period of " + $$2 + " too short for selected resolution of " + this.c);
      } else {
         return new exo.e<>($$0, $$1, $$4, $$3);
      }
   }

   public exo.c a() {
      return new exo.c();
   }

   static record a<T>(Either<T, Exception> a, long b) {
   }

   class b<T> {
      private final exo.e<T> b;
      private final Consumer<T> c;
      private long d = -1L;

      b(exo.e<T> $$0, Consumer<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      void a(long $$0) {
         this.b.a($$0);
         this.a();
      }

      void a() {
         exo.d<T> $$0 = this.b.g;
         if ($$0 != null && this.d < $$0.b) {
            this.c.accept($$0.a);
            this.d = $$0.b;
         }
      }

      void b() {
         exo.d<T> $$0 = this.b.g;
         if ($$0 != null) {
            this.c.accept($$0.a);
            this.d = $$0.b;
         }
      }

      void c() {
         this.b.a();
         this.d = -1L;
      }
   }

   public class c {
      private final List<exo.b<?>> b = new ArrayList<>();

      public <T> void a(exo.e<T> $$0, Consumer<T> $$1) {
         exo.b<T> $$2 = exo.this.new b<>($$0, $$1);
         this.b.add($$2);
         $$2.a();
      }

      public void a() {
         for (exo.b<?> $$0 : this.b) {
            $$0.b();
         }
      }

      public void b() {
         for (exo.b<?> $$0 : this.b) {
            $$0.a(exo.this.d.get(exo.this.c));
         }
      }

      public void c() {
         for (exo.b<?> $$0 : this.b) {
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
      private final exp e;
      @Nullable
      private CompletableFuture<exo.a<T>> f;
      @Nullable
      exo.d<T> g;
      private long h = -1L;

      e(String $$1, Callable<T> $$2, long $$3, exp $$4) {
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      void a(long $$0) {
         if (this.f != null) {
            exo.a<T> $$1 = this.f.getNow(null);
            if ($$1 == null) {
               return;
            }

            this.f = null;
            long $$2 = $$1.b;
            $$1.a().ifLeft($$1x -> {
               this.g = new exo.d<>((T)$$1x, $$2);
               this.h = $$2 + this.d * this.e.a();
            }).ifRight($$1x -> {
               long $$2x = this.e.b();
               exo.a.warn("Failed to process task {}, will repeat after {} cycles", new Object[]{this.b, $$2x, $$1x});
               this.h = $$2 + this.d * $$2x;
            });
         }

         if (this.h <= $$0) {
            this.f = CompletableFuture.supplyAsync(() -> {
               try {
                  T $$0x = this.c.call();
                  long $$1x = exo.this.d.get(exo.this.c);
                  return new exo.a<>(Either.left($$0x), $$1x);
               } catch (Exception var4x) {
                  long $$3 = exo.this.d.get(exo.this.c);
                  return new exo.a<>(Either.right(var4x), $$3);
               }
            }, exo.this.b);
         }
      }

      public void a() {
         this.f = null;
         this.g = null;
         this.h = -1L;
      }
   }
}
