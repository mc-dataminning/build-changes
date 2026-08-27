import java.util.List;
import javax.annotation.Nullable;

public class cts extends cui implements cuy {
   public static final dfw<dfr> a = dfo.bd;

   public cts(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(aC, hb.c).a(c, Boolean.valueOf(false)).a(a, dfr.a));
   }

   @Override
   protected int g(dey $$0) {
      return 2;
   }

   @Override
   protected int b(coq $$0, gv $$1, dey $$2) {
      dck $$3 = $$0.c_($$1);
      return $$3 instanceof dcv ? ((dcv)$$3).c() : 0;
   }

   private int e(cpk $$0, gv $$1, dey $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((cqa)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(a) == dfr.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(cpk $$0, gv $$1, dey $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((cqa)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(a) == dfr.a;
      }
   }

   @Override
   protected int b(cpk $$0, gv $$1, dey $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      hb $$4 = $$2.c(aC);
      gv $$5 = $$1.a($$4);
      dey $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         bxx $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.E(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private bxx a(cpk $$0, hb $$1, gv $$2) {
      List<bxx> $$3 = $$0.a(
         bxx.class,
         new eha((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cD() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if (!$$3.fR().e) {
         return bgo.d;
      } else {
         $$0 = $$0.a(a);
         float $$6 = $$0.c(a) == dfr.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, aou.eF, aov.e, 0.3F, $$6);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bgo.a($$1.B);
      }
   }

   @Override
   protected void c(cpk $$0, gv $$1, dey $$2) {
      if (!$$0.L().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dck $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dcv ? ((dcv)$$4).c() : 0;
         if ($$3 != $$5 || $$2.c(c) != this.a($$0, $$1, $$2)) {
            eiv $$6 = this.c($$0, $$1, $$2) ? eiv.c : eiv.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(cpk $$0, gv $$1, dey $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dck $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dcv $$6) {
         $$5 = $$6.c();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(a) == dfr.a) {
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
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   public boolean a(dey $$0, cpk $$1, gv $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dck $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new dcv($$0, $$1);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(aC, a, c);
   }
}
