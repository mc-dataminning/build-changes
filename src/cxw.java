import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxw extends ctz<dgd> implements dcf {
   public static final MapCodec<cxw> b = b(cxw::new);
   public static final dih c = cza.aE;
   public static final die d = did.C;
   protected static final eks e = cvf.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final uv f = uv.c("container.enderchest");

   @Override
   public MapCodec<cxw> a() {
      return b;
   }

   protected cxw(dhm.d $$0) {
      super($$0, () -> dfk.d);
      this.k(this.E.b().a(c, ib.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public cxm.c<? extends dfp> a(dhn $$0, csf $$1, hx $$2, boolean $$3) {
      return cxm.b::b;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return e;
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.b;
   }

   @Override
   public dhn a(cnw $$0) {
      ecx $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == ecy.c));
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      cid $$6 = $$3.gg();
      dfi $$7 = $$1.c_($$2);
      if ($$6 != null && $$7 instanceof dgd) {
         hx $$8 = $$2.c();
         if ($$1.a_($$8).g($$1, $$8)) {
            return bjb.a($$1.B);
         } else if ($$1.B) {
            return bjb.a;
         } else {
            dgd $$9 = (dgd)$$7;
            $$6.a($$9);
            $$3.a(new bjk(($$1x, $$2x, $$3x) -> cgy.a($$1x, $$2x, $$6), f));
            $$3.a(arf.aj);
            ccq.a($$3, true);
            return bjb.b;
         }
      } else {
         return bjb.a($$1.B);
      }
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dgd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return $$0.B ? a($$2, dfk.d, dgd::a) : null;
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(jw.X, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c, d);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(d) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      dfi $$4 = $$1.c_($$2);
      if ($$4 instanceof dgd) {
         ((dgd)$$4).c();
      }
   }
}
