import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class csv extends csd {
   private static final int p = 3;
   private static final int q = 3;
   public static final int o = 0;
   private static final int r = 1;
   private static final int s = 9;
   private static final int t = 10;
   private static final int u = 10;
   private static final int v = 37;
   private static final int w = 37;
   private static final int x = 46;
   private final csp y;
   private final cox z;
   private boolean A;

   public csv(int $$0, cow $$1) {
      this($$0, $$1, csp.a);
   }

   public csv(int $$0, cow $$1, csp $$2) {
      super(ctl.m, $$0, 3, 3);
      this.y = $$2;
      this.z = $$1.k;
      this.a(this.z, 124, 35);
      this.d(30, 17);
      this.c($$1, 8, 84);
   }

   protected static void a(csc $$0, ard $$1, cox $$2, csu $$3, ctu $$4, @Nullable dbj<dat> $$5) {
      das $$6 = $$3.aB_();
      are $$7 = (are)$$2;
      cwp $$8 = cwp.j;
      Optional<dbj<dat>> $$9 = $$1.p().aI().a(dbp.a, $$6, $$1, $$5);
      if ($$9.isPresent()) {
         dbj<dat> $$10 = $$9.get();
         dat $$11 = $$10.b();
         if ($$4.a($$7, $$10)) {
            cwp $$12 = $$11.a($$6, $$1.K_());
            if ($$12.a($$1.K())) {
               $$8 = $$12;
            }
         }
      }

      $$4.a(0, $$8);
      $$0.a(0, $$8);
      $$7.f.b(new aci($$0.l, $$0.k(), 0, $$8));
   }

   @Override
   public void a(bsd $$0) {
      if (!this.A) {
         this.y.a(($$0x, $$1) -> {
            if ($$0x instanceof ard $$2) {
               a(this, $$2, this.z, this.m, this.n, null);
            }
         });
      }
   }

   @Override
   public void l() {
      this.A = true;
   }

   @Override
   public void a(ard $$0, dbj<dat> $$1) {
      this.A = false;
      a(this, $$0, this.z, this.m, this.n, $$1);
   }

   @Override
   public void a(cox $$0) {
      super.a($$0);
      this.y.a(($$1, $$2) -> this.a($$0, this.m));
   }

   @Override
   public boolean b(cox $$0) {
      return a(this.y, $$0, djo.cI);
   }

   @Override
   public cwp b(cox $$0, int $$1) {
      cwp $$2 = cwp.j;
      ctz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwp $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            this.y.a(($$2x, $$3x) -> $$4.h().a($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cwp.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cwp.j;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cwp.j;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cwp.j;
         }

         if ($$4.f()) {
            $$3.e(cwp.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwp.j;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cwp $$0, ctz $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public ctz m() {
      return this.k.get(0);
   }

   @Override
   public List<ctz> n() {
      return this.k.subList(1, 10);
   }

   @Override
   public cts am_() {
      return cts.a;
   }

   @Override
   protected cox q() {
      return this.z;
   }
}
