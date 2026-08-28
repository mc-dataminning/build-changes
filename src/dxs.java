import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public record dxs(dxp a, dxn b, dxn c, int d, dxq e) {

   public int a(dxp $$0) {
      return $$0 == this.a ? 0 : this.c.a($$0);
   }

   public CompletableFuture<dwo> a(dxu $$0, azz<arb> $$1, dwo $$2) {
      if ($$2.j().d(this.a)) {
         bop $$3 = bom.f.a($$2.f(), $$0.a().ag(), this.a.f());
         return this.e.doWork($$0, this, $$1, $$2).thenApply($$1x -> this.a($$1x, $$3));
      } else {
         return this.e.doWork($$0, this, $$1, $$2);
      }
   }

   private dwo a(dwo $$0, @Nullable bop $$1) {
      if ($$0 instanceof dxi $$2 && $$2.j().d(this.a)) {
         $$2.a(this.a);
      }

      if ($$1 != null) {
         $$1.finish();
      }

      return $$0;
   }

   public static class a {
      private final dxp a;
      @Nullable
      private final dxs b;
      private dxp[] c;
      private int d = -1;
      private dxq e = dxr::a;

      protected a(dxp $$0) {
         if ($$0.c() != $$0) {
            throw new IllegalArgumentException("Not starting with the first status: " + $$0);
         } else {
            this.a = $$0;
            this.b = null;
            this.c = new dxp[0];
         }
      }

      protected a(dxp $$0, dxs $$1) {
         if ($$1.a.b() != $$0.b() - 1) {
            throw new IllegalArgumentException("Out of order status: " + $$0);
         } else {
            this.a = $$0;
            this.b = $$1;
            this.c = new dxp[]{$$1.a};
         }
      }

      public dxs.a a(dxp $$0, int $$1) {
         if ($$0.a(this.a)) {
            throw new IllegalArgumentException("Status " + $$0 + " can not be required by " + this.a);
         } else {
            dxp[] $$2 = this.c;
            int $$3 = $$1 + 1;
            if ($$3 > $$2.length) {
               this.c = new dxp[$$3];
               Arrays.fill(this.c, $$0);
            }

            for (int $$4 = 0; $$4 < Math.min($$3, $$2.length); $$4++) {
               this.c[$$4] = dxp.a($$2[$$4], $$0);
            }

            return this;
         }
      }

      public dxs.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public dxs.a a(dxq $$0) {
         this.e = $$0;
         return this;
      }

      public dxs a() {
         return new dxs(this.a, new dxn(ImmutableList.copyOf(this.c)), new dxn(ImmutableList.copyOf(this.b())), this.d, this.e);
      }

      private dxp[] b() {
         if (this.b == null) {
            return this.c;
         } else {
            int $$0 = this.a(this.b.a);
            dxn $$1 = this.b.c;
            dxp[] $$2 = new dxp[Math.max($$0 + $$1.b(), this.c.length)];

            for (int $$3 = 0; $$3 < $$2.length; $$3++) {
               int $$4 = $$3 - $$0;
               if ($$4 < 0 || $$4 >= $$1.b()) {
                  $$2[$$3] = this.c[$$3];
               } else if ($$3 >= this.c.length) {
                  $$2[$$3] = $$1.a($$4);
               } else {
                  $$2[$$3] = dxp.a(this.c[$$3], $$1.a($$4));
               }
            }

            return $$2;
         }
      }

      private int a(dxp $$0) {
         for (int $$1 = this.c.length - 1; $$1 >= 0; $$1--) {
            if (this.c[$$1].a($$0)) {
               return $$1;
            }
         }

         return 0;
      }
   }
}
