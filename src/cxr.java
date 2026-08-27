import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxr extends ctu<dfy> implements dca {
   public static final MapCodec<cxr> b = b(cxr::new);
   public static final dic c = cyv.aE;
   public static final dhz d = dhy.C;
   protected static final ekn e = cva.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final ur f = ur.c("container.enderchest");

   @Override
   public MapCodec<cxr> a() {
      return b;
   }

   protected cxr(dhh.d $$0) {
      super($$0, () -> dff.d);
      this.k(this.E.b().a(c, hx.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public cxh.c<? extends dfk> a(dhi $$0, csa $$1, ht $$2, boolean $$3) {
      return cxh.b::b;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return e;
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.b;
   }

   @Override
   public dhi a(cnr $$0) {
      ecs $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == ect.c));
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      chy $$6 = $$3.gg();
      dfd $$7 = $$1.c_($$2);
      if ($$6 != null && $$7 instanceof dfy) {
         ht $$8 = $$2.c();
         if ($$1.a_($$8).g($$1, $$8)) {
            return bix.a($$1.B);
         } else if ($$1.B) {
            return bix.a;
         } else {
            dfy $$9 = (dfy)$$7;
            $$6.a($$9);
            $$3.a(new bjf(($$1x, $$2x, $$3x) -> cgt.a($$1x, $$2x, $$6), f));
            $$3.a(arb.aj);
            ccl.a($$3, true);
            return bix.b;
         }
      } else {
         return bix.a($$1.B);
      }
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dfy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return $$0.B ? a($$2, dff.d, dfy::a) : null;
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(js.X, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c, d);
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(d) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      dfd $$4 = $$1.c_($$2);
      if ($$4 instanceof dfy) {
         ((dfy)$$4).c();
      }
   }
}
