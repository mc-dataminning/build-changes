import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public record ecp(ecm a, eck b, eck c, int d, ecn e) {

   public int a(ecm $$0) {
      return $$0 == this.a ? 0 : this.c.a($$0);
   }

   public CompletableFuture<ebl> a(ecr $$0, bag<are> $$1, ebl $$2) {
      if ($$2.n().d(this.a)) {
         bqu $$3 = bqr.f.a($$2.f(), $$0.a().aj(), this.a.f());
         return this.e.doWork($$0, this, $$1, $$2).thenApply($$1x -> this.a($$1x, $$3));
      } else {
         return this.e.doWork($$0, this, $$1, $$2);
      }
   }

   private ebl a(ebl $$0, @Nullable bqu $$1) {
      if ($$0 instanceof ecf $$2 && $$2.n().d(this.a)) {
         $$2.a(this.a);
      }

      if ($$1 != null) {
         $$1.finish(true);
      }

      return $$0;
   }

   public static class a {
      private final ecm a;
      @Nullable
      private final ecp b;
      private ecm[] c;
      private int d = -1;
      private ecn e = eco::a;

      protected a(ecm $$0) {
         if ($$0.c() != $$0) {
            throw new IllegalArgumentException("Not starting with the first status: " + $$0);
         } else {
            this.a = $$0;
            this.b = null;
            this.c = new ecm[0];
         }
      }

      protected a(ecm $$0, ecp $$1) {
         if ($$1.a.b() != $$0.b() - 1) {
            throw new IllegalArgumentException("Out of order status: " + $$0);
         } else {
            this.a = $$0;
            this.b = $$1;
            this.c = new ecm[]{$$1.a};
         }
      }

      public ecp.a a(ecm $$0, int $$1) {
         if ($$0.a(this.a)) {
            throw new IllegalArgumentException("Status " + $$0 + " can not be required by " + this.a);
         } else {
            ecm[] $$2 = this.c;
            int $$3 = $$1 + 1;
            if ($$3 > $$2.length) {
               this.c = new ecm[$$3];
               Arrays.fill(this.c, $$0);
            }

            for (int $$4 = 0; $$4 < Math.min($$3, $$2.length); $$4++) {
               this.c[$$4] = ecm.a($$2[$$4], $$0);
            }

            return this;
         }
      }

      public ecp.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public ecp.a a(ecn $$0) {
         this.e = $$0;
         return this;
      }

      public ecp a() {
         return new ecp(this.a, new eck(ImmutableList.copyOf(this.c)), new eck(ImmutableList.copyOf(this.b())), this.d, this.e);
      }

      private ecm[] b() {
         if (this.b == null) {
            return this.c;
         } else {
            int $$0 = this.a(this.b.a);
            eck $$1 = this.b.c;
            ecm[] $$2 = new ecm[Math.max($$0 + $$1.b(), this.c.length)];

            for (int $$3 = 0; $$3 < $$2.length; $$3++) {
               int $$4 = $$3 - $$0;
               if ($$4 < 0 || $$4 >= $$1.b()) {
                  $$2[$$3] = this.c[$$3];
               } else if ($$3 >= this.c.length) {
                  $$2[$$3] = $$1.a($$4);
               } else {
                  $$2[$$3] = ecm.a(this.c[$$3], $$1.a($$4));
               }
            }

            return $$2;
         }
      }

      private int a(ecm $$0) {
         for (int $$1 = this.c.length - 1; $$1 >= 0; $$1--) {
            if (this.c[$$1].a($$0)) {
               return $$1;
            }
         }

         return 0;
      }
   }
}
