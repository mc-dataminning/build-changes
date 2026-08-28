import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public record dwa(dvx a, dvv b, dvv c, int d, dvy e) {

   public int a(dvx $$0) {
      return $$0 == this.a ? 0 : this.c.a($$0);
   }

   public CompletableFuture<duw> a(dwc $$0, azh<aqm> $$1, duw $$2) {
      if ($$2.j().d(this.a)) {
         bnn $$3 = bnk.f.a($$2.f(), $$0.a().af(), this.a.f());
         return this.e.doWork($$0, this, $$1, $$2).thenApply($$1x -> this.a($$1x, $$3));
      } else {
         return this.e.doWork($$0, this, $$1, $$2);
      }
   }

   private duw a(duw $$0, @Nullable bnn $$1) {
      if ($$0 instanceof dvq $$2 && $$2.j().d(this.a)) {
         $$2.a(this.a);
      }

      if ($$1 != null) {
         $$1.finish();
      }

      return $$0;
   }

   public static class a {
      private final dvx a;
      @Nullable
      private final dwa b;
      private dvx[] c;
      private int d = -1;
      private dvy e = dvz::a;

      protected a(dvx $$0) {
         if ($$0.c() != $$0) {
            throw new IllegalArgumentException("Not starting with the first status: " + $$0);
         } else {
            this.a = $$0;
            this.b = null;
            this.c = new dvx[0];
         }
      }

      protected a(dvx $$0, dwa $$1) {
         if ($$1.a.b() != $$0.b() - 1) {
            throw new IllegalArgumentException("Out of order status: " + $$0);
         } else {
            this.a = $$0;
            this.b = $$1;
            this.c = new dvx[]{$$1.a};
         }
      }

      public dwa.a a(dvx $$0, int $$1) {
         if ($$0.a(this.a)) {
            throw new IllegalArgumentException("Status " + $$0 + " can not be required by " + this.a);
         } else {
            dvx[] $$2 = this.c;
            int $$3 = $$1 + 1;
            if ($$3 > $$2.length) {
               this.c = new dvx[$$3];
               Arrays.fill(this.c, $$0);
            }

            for (int $$4 = 0; $$4 < Math.min($$3, $$2.length); $$4++) {
               this.c[$$4] = dvx.a($$2[$$4], $$0);
            }

            return this;
         }
      }

      public dwa.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public dwa.a a(dvy $$0) {
         this.e = $$0;
         return this;
      }

      public dwa a() {
         return new dwa(this.a, new dvv(ImmutableList.copyOf(this.c)), new dvv(ImmutableList.copyOf(this.b())), this.d, this.e);
      }

      private dvx[] b() {
         if (this.b == null) {
            return this.c;
         } else {
            int $$0 = this.a(this.b.a);
            dvv $$1 = this.b.c;
            dvx[] $$2 = new dvx[Math.max($$0 + $$1.b(), this.c.length)];

            for (int $$3 = 0; $$3 < $$2.length; $$3++) {
               int $$4 = $$3 - $$0;
               if ($$4 < 0 || $$4 >= $$1.b()) {
                  $$2[$$3] = this.c[$$3];
               } else if ($$3 >= this.c.length) {
                  $$2[$$3] = $$1.a($$4);
               } else {
                  $$2[$$3] = dvx.a(this.c[$$3], $$1.a($$4));
               }
            }

            return $$2;
         }
      }

      private int a(dvx $$0) {
         for (int $$1 = this.c.length - 1; $$1 >= 0; $$1--) {
            if (this.c[$$1].a($$0)) {
               return $$1;
            }
         }

         return 0;
      }
   }
}
