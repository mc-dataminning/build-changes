import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ctv extends ctd {
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
   private final ctp y;
   private final cpx z;
   private boolean A;

   public ctv(int $$0, cpw $$1) {
      this($$0, $$1, ctp.a);
   }

   public ctv(int $$0, cpw $$1, ctp $$2) {
      super(cul.m, $$0, 3, 3);
      this.y = $$2;
      this.z = $$1.k;
      this.a(this.z, 124, 35);
      this.d(30, 17);
      this.c($$1, 8, 84);
   }

   protected static void a(ctc $$0, ash $$1, cpx $$2, ctu $$3, cuu $$4, @Nullable dcj<dbt> $$5) {
      dbs $$6 = $$3.aC_();
      asi $$7 = (asi)$$2;
      cxp $$8 = cxp.j;
      Optional<dcj<dbt>> $$9 = $$1.p().aI().a(dcp.a, $$6, $$1, $$5);
      if ($$9.isPresent()) {
         dcj<dbt> $$10 = $$9.get();
         dbt $$11 = $$10.b();
         if ($$4.a($$7, $$10)) {
            cxp $$12 = $$11.a($$6, $$1.K_());
            if ($$12.a($$1.J())) {
               $$8 = $$12;
            }
         }
      }

      $$4.a(0, $$8);
      $$0.a(0, $$8);
      $$7.f.b(new ado($$0.l, $$0.k(), 0, $$8));
   }

   @Override
   public void a(btc $$0) {
      if (!this.A) {
         this.y.a(($$0x, $$1) -> {
            if ($$0x instanceof ash $$2) {
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
   public void a(ash $$0, dcj<dbt> $$1) {
      this.A = false;
      a(this, $$0, this.z, this.m, this.n, $$1);
   }

   @Override
   public void a(cpx $$0) {
      super.a($$0);
      this.y.a(($$1, $$2) -> this.a($$0, this.m));
   }

   @Override
   public boolean b(cpx $$0) {
      return a(this.y, $$0, dko.cI);
   }

   @Override
   public cxp b(cpx $$0, int $$1) {
      cxp $$2 = cxp.j;
      cuz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxp $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            this.y.a(($$2x, $$3x) -> $$4.h().a($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cxp.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cxp.j;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cxp.j;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cxp.j;
         }

         if ($$4.f()) {
            $$3.e(cxp.j);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cxp.j;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cxp $$0, cuz $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cuz m() {
      return this.k.get(0);
   }

   @Override
   public List<cuz> n() {
      return this.k.subList(1, 10);
   }

   @Override
   public cus an_() {
      return cus.a;
   }

   @Override
   protected cpx q() {
      return this.z;
   }
}
