import java.util.List;
import javax.annotation.Nullable;

public class cty extends cuo implements cve {
   public static final dgc<dfx> a = dfu.bd;

   public cty(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(aC, hc.c).a(c, Boolean.valueOf(false)).a(a, dfx.a));
   }

   @Override
   protected int g(dfe $$0) {
      return 2;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return $$1 == hc.a && !this.a($$3, $$5, $$2) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int b(cow $$0, gw $$1, dfe $$2) {
      dcq $$3 = $$0.c_($$1);
      return $$3 instanceof ddb ? ((ddb)$$3).c() : 0;
   }

   private int e(cpq $$0, gw $$1, dfe $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((cqg)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(a) == dfx.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(cpq $$0, gw $$1, dfe $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((cqg)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(a) == dfx.a;
      }
   }

   @Override
   protected int b(cpq $$0, gw $$1, dfe $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      hc $$4 = $$2.c(aC);
      gw $$5 = $$1.a($$4);
      dfe $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         byb $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.E(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private byb a(cpq $$0, hc $$1, gw $$2) {
      List<byb> $$3 = $$0.a(
         byb.class,
         new ehd((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cD() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if (!$$3.fR().e) {
         return bgt.d;
      } else {
         $$0 = $$0.a(a);
         float $$6 = $$0.c(a) == dfx.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, aoz.eF, apa.e, 0.3F, $$6);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bgt.a($$1.B);
      }
   }

   @Override
   protected void c(cpq $$0, gw $$1, dfe $$2) {
      if (!$$0.L().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dcq $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof ddb ? ((ddb)$$4).c() : 0;
         if ($$3 != $$5 || $$2.c(c) != this.a($$0, $$1, $$2)) {
            eiy $$6 = this.c($$0, $$1, $$2) ? eiy.c : eiy.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(cpq $$0, gw $$1, dfe $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dcq $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof ddb $$6) {
         $$5 = $$6.c();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(a) == dfx.a) {
         boolean $$7 = this.a($$0, $$1, $$2);
         boolean $$8 = $$2.c(c);
         if ($$8 && !$$7) {
            $$0.a($$1, $$2.a(c, Boolean.valueOf(false)), 2);
         } else if (!$$8 && $$7) {
            $$0.a($$1, $$2.a(c, Boolean.valueOf(true)), 2);
         }

         this.d($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   public boolean a(dfe $$0, cpq $$1, gw $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dcq $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new ddb($$0, $$1);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(aC, a, c);
   }
}
