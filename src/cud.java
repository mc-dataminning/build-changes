import java.util.List;
import javax.annotation.Nullable;

public class cud extends cut implements cvj {
   public static final dgh<dgc> a = dfz.bd;

   public cud(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(aC, ha.c).a(c, Boolean.valueOf(false)).a(a, dgc.a));
   }

   @Override
   protected int g(dfj $$0) {
      return 2;
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return $$1 == ha.a && !this.a($$3, $$5, $$2) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int b(cpb $$0, gw $$1, dfj $$2) {
      dcv $$3 = $$0.c_($$1);
      return $$3 instanceof ddg ? ((ddg)$$3).c() : 0;
   }

   private int e(cpv $$0, gw $$1, dfj $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((cql)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(a) == dgc.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(cpv $$0, gw $$1, dfj $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((cql)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(a) == dgc.a;
      }
   }

   @Override
   protected int b(cpv $$0, gw $$1, dfj $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      ha $$4 = $$2.c(aC);
      gw $$5 = $$1.a($$4);
      dfj $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         byg $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.K(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private byg a(cpv $$0, ha $$1, gw $$2) {
      List<byg> $$3 = $$0.a(
         byg.class,
         new ehi((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cD() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if (!$$3.fS().e) {
         return bgy.d;
      } else {
         $$0 = $$0.a(a);
         float $$6 = $$0.c(a) == dgc.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, apd.eF, ape.e, 0.3F, $$6);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bgy.a($$1.B);
      }
   }

   @Override
   protected void c(cpv $$0, gw $$1, dfj $$2) {
      if (!$$0.L().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dcv $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof ddg ? ((ddg)$$4).c() : 0;
         if ($$3 != $$5 || $$2.c(c) != this.a($$0, $$1, $$2)) {
            ejd $$6 = this.c($$0, $$1, $$2) ? ejd.c : ejd.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(cpv $$0, gw $$1, dfj $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dcv $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof ddg $$6) {
         $$5 = $$6.c();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(a) == dgc.a) {
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
   public void a(dfj $$0, akq $$1, gw $$2, asc $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   public boolean a(dfj $$0, cpv $$1, gw $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dcv $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new ddg($$0, $$1);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(aC, a, c);
   }
}
