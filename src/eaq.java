import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public record eaq(ean a, eal b, eal c, int d, eao e) {

   public int a(ean $$0) {
      return $$0 == this.a ? 0 : this.c.a($$0);
   }

   public CompletableFuture<dzm> a(eas $$0, azt<aqt> $$1, dzm $$2) {
      if ($$2.n().d(this.a)) {
         bpu $$3 = bpr.f.a($$2.f(), $$0.a().aj(), this.a.f());
         return this.e.doWork($$0, this, $$1, $$2).thenApply($$1x -> this.a($$1x, $$3));
      } else {
         return this.e.doWork($$0, this, $$1, $$2);
      }
   }

   private dzm a(dzm $$0, @Nullable bpu $$1) {
      if ($$0 instanceof eag $$2 && $$2.n().d(this.a)) {
         $$2.a(this.a);
      }

      if ($$1 != null) {
         $$1.finish(true);
      }

      return $$0;
   }

   public static class a {
      private final ean a;
      @Nullable
      private final eaq b;
      private ean[] c;
      private int d = -1;
      private eao e = eap::a;

      protected a(ean $$0) {
         if ($$0.c() != $$0) {
            throw new IllegalArgumentException("Not starting with the first status: " + $$0);
         } else {
            this.a = $$0;
            this.b = null;
            this.c = new ean[0];
         }
      }

      protected a(ean $$0, eaq $$1) {
         if ($$1.a.b() != $$0.b() - 1) {
            throw new IllegalArgumentException("Out of order status: " + $$0);
         } else {
            this.a = $$0;
            this.b = $$1;
            this.c = new ean[]{$$1.a};
         }
      }

      public eaq.a a(ean $$0, int $$1) {
         if ($$0.a(this.a)) {
            throw new IllegalArgumentException("Status " + $$0 + " can not be required by " + this.a);
         } else {
            ean[] $$2 = this.c;
            int $$3 = $$1 + 1;
            if ($$3 > $$2.length) {
               this.c = new ean[$$3];
               Arrays.fill(this.c, $$0);
            }

            for (int $$4 = 0; $$4 < Math.min($$3, $$2.length); $$4++) {
               this.c[$$4] = ean.a($$2[$$4], $$0);
            }

            return this;
         }
      }

      public eaq.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public eaq.a a(eao $$0) {
         this.e = $$0;
         return this;
      }

      public eaq a() {
         return new eaq(this.a, new eal(ImmutableList.copyOf(this.c)), new eal(ImmutableList.copyOf(this.b())), this.d, this.e);
      }

      private ean[] b() {
         if (this.b == null) {
            return this.c;
         } else {
            int $$0 = this.a(this.b.a);
            eal $$1 = this.b.c;
            ean[] $$2 = new ean[Math.max($$0 + $$1.b(), this.c.length)];

            for (int $$3 = 0; $$3 < $$2.length; $$3++) {
               int $$4 = $$3 - $$0;
               if ($$4 < 0 || $$4 >= $$1.b()) {
                  $$2[$$3] = this.c[$$3];
               } else if ($$3 >= this.c.length) {
                  $$2[$$3] = $$1.a($$4);
               } else {
                  $$2[$$3] = ean.a(this.c[$$3], $$1.a($$4));
               }
            }

            return $$2;
         }
      }

      private int a(ean $$0) {
         for (int $$1 = this.c.length - 1; $$1 >= 0; $$1--) {
            if (this.c[$$1].a($$0)) {
               return $$1;
            }
         }

         return 0;
      }
   }
}
