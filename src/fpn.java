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

public class fpn {
   static final Logger a = LogUtils.getLogger();
   final Executor b;
   final TimeUnit c;
   final bat d;

   public fpn(Executor $$0, TimeUnit $$1, bat $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public <T> fpn.e<T> a(String $$0, Callable<T> $$1, Duration $$2, fpo $$3) {
      long $$4 = this.c.convert($$2);
      if ($$4 == 0L) {
         throw new IllegalArgumentException("Period of " + $$2 + " too short for selected resolution of " + this.c);
      } else {
         return new fpn.e<>($$0, $$1, $$4, $$3);
      }
   }

   public fpn.c a() {
      return new fpn.c();
   }

   static record a<T>(Either<T, Exception> a, long b) {
   }

   class b<T> {
      private final fpn.e<T> a;
      private final Consumer<T> b;
      private long c = -1L;

      b(final fpn.e<T> $$0, final Consumer<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(long $$0) {
         this.a.a($$0);
         this.a();
      }

      void a() {
         fpn.d<T> $$0 = this.a.g;
         if ($$0 != null && this.c < $$0.b) {
            this.b.accept($$0.a);
            this.c = $$0.b;
         }
      }

      void b() {
         fpn.d<T> $$0 = this.a.g;
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
      private final List<fpn.b<?>> b = new ArrayList<>();

      public <T> void a(fpn.e<T> $$0, Consumer<T> $$1) {
         fpn.b<T> $$2 = fpn.this.new b<>($$0, $$1);
         this.b.add($$2);
         $$2.a();
      }

      public void a() {
         for (fpn.b<?> $$0 : this.b) {
            $$0.b();
         }
      }

      public void b() {
         for (fpn.b<?> $$0 : this.b) {
            $$0.a(fpn.this.d.get(fpn.this.c));
         }
      }

      public void c() {
         for (fpn.b<?> $$0 : this.b) {
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
      private final fpo e;
      @Nullable
      private CompletableFuture<fpn.a<T>> f;
      @Nullable
      fpn.d<T> g;
      private long h = -1L;

      e(final String $$1, final Callable<T> $$2, final long $$3, final fpo $$4) {
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      void a(long $$0) {
         if (this.f != null) {
            fpn.a<T> $$1 = this.f.getNow(null);
            if ($$1 == null) {
               return;
            }

            this.f = null;
            long $$2 = $$1.b;
            $$1.a().ifLeft($$1x -> {
               this.g = new fpn.d<>((T)$$1x, $$2);
               this.h = $$2 + this.d * this.e.a();
            }).ifRight($$1x -> {
               long $$2x = this.e.b();
               fpn.a.warn("Failed to process task {}, will repeat after {} cycles", new Object[]{this.b, $$2x, $$1x});
               this.h = $$2 + this.d * $$2x;
            });
         }

         if (this.h <= $$0) {
            this.f = CompletableFuture.supplyAsync(() -> {
               try {
                  T $$0x = this.c.call();
                  long $$1x = fpn.this.d.get(fpn.this.c);
                  return new fpn.a<>(Either.left($$0x), $$1x);
               } catch (Exception var4x) {
                  long $$3 = fpn.this.d.get(fpn.this.c);
                  return new fpn.a<>(Either.right(var4x), $$3);
               }
            }, fpn.this.b);
         }
      }

      public void a() {
         this.f = null;
         this.g = null;
         this.h = -1L;
      }
   }
}
