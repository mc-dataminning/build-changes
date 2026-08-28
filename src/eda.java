import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public record eda(ecx a, ecv b, ecv c, int d, ecy e) {

   public int a(ecx $$0) {
      return $$0 == this.a ? 0 : this.c.a($$0);
   }

   public CompletableFuture<ebw> a(edc $$0, bai<arg> $$1, ebw $$2) {
      if ($$2.n().d(this.a)) {
         bqx $$3 = bqu.f.a($$2.f(), $$0.a().aj(), this.a.f());
         return this.e.doWork($$0, this, $$1, $$2).thenApply($$1x -> this.a($$1x, $$3));
      } else {
         return this.e.doWork($$0, this, $$1, $$2);
      }
   }

   private ebw a(ebw $$0, @Nullable bqx $$1) {
      if ($$0 instanceof ecq $$2 && $$2.n().d(this.a)) {
         $$2.a(this.a);
      }

      if ($$1 != null) {
         $$1.finish(true);
      }

      return $$0;
   }

   public static class a {
      private final ecx a;
      @Nullable
      private final eda b;
      private ecx[] c;
      private int d = -1;
      private ecy e = ecz::a;

      protected a(ecx $$0) {
         if ($$0.c() != $$0) {
            throw new IllegalArgumentException("Not starting with the first status: " + $$0);
         } else {
            this.a = $$0;
            this.b = null;
            this.c = new ecx[0];
         }
      }

      protected a(ecx $$0, eda $$1) {
         if ($$1.a.b() != $$0.b() - 1) {
            throw new IllegalArgumentException("Out of order status: " + $$0);
         } else {
            this.a = $$0;
            this.b = $$1;
            this.c = new ecx[]{$$1.a};
         }
      }

      public eda.a a(ecx $$0, int $$1) {
         if ($$0.a(this.a)) {
            throw new IllegalArgumentException("Status " + $$0 + " can not be required by " + this.a);
         } else {
            ecx[] $$2 = this.c;
            int $$3 = $$1 + 1;
            if ($$3 > $$2.length) {
               this.c = new ecx[$$3];
               Arrays.fill(this.c, $$0);
            }

            for (int $$4 = 0; $$4 < Math.min($$3, $$2.length); $$4++) {
               this.c[$$4] = ecx.a($$2[$$4], $$0);
            }

            return this;
         }
      }

      public eda.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public eda.a a(ecy $$0) {
         this.e = $$0;
         return this;
      }

      public eda a() {
         return new eda(this.a, new ecv(ImmutableList.copyOf(this.c)), new ecv(ImmutableList.copyOf(this.b())), this.d, this.e);
      }

      private ecx[] b() {
         if (this.b == null) {
            return this.c;
         } else {
            int $$0 = this.a(this.b.a);
            ecv $$1 = this.b.c;
            ecx[] $$2 = new ecx[Math.max($$0 + $$1.b(), this.c.length)];

            for (int $$3 = 0; $$3 < $$2.length; $$3++) {
               int $$4 = $$3 - $$0;
               if ($$4 < 0 || $$4 >= $$1.b()) {
                  $$2[$$3] = this.c[$$3];
               } else if ($$3 >= this.c.length) {
                  $$2[$$3] = $$1.a($$4);
               } else {
                  $$2[$$3] = ecx.a(this.c[$$3], $$1.a($$4));
               }
            }

            return $$2;
         }
      }

      private int a(ecx $$0) {
         for (int $$1 = this.c.length - 1; $$1 >= 0; $$1--) {
            if (this.c[$$1].a($$0)) {
               return $$1;
            }
         }

         return 0;
      }
   }
}
