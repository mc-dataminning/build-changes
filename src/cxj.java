import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxj extends ctm<dfm> implements dbt {
   public static final MapCodec<cxj> b = b(cxj::new);
   public static final dhq c = cyo.aE;
   public static final dhn d = dhm.C;
   protected static final ekb e = cut.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final ur f = ur.c("container.enderchest");

   @Override
   public MapCodec<cxj> a() {
      return b;
   }

   protected cxj(dgv.d $$0) {
      super($$0, () -> det.d);
      this.k(this.E.b().a(c, hx.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public cwz.c<? extends dey> a(dgw $$0, crs $$1, ht $$2, boolean $$3) {
      return cwz.b::b;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return e;
   }

   @Override
   public day b_(dgw $$0) {
      return day.b;
   }

   @Override
   public dgw a(cnj $$0) {
      ecg $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == ech.c));
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      chq $$6 = $$3.gf();
      der $$7 = $$1.c_($$2);
      if ($$6 != null && $$7 instanceof dfm) {
         ht $$8 = $$2.c();
         if ($$1.a_($$8).g($$1, $$8)) {
            return biq.a($$1.B);
         } else if ($$1.B) {
            return biq.a;
         } else {
            dfm $$9 = (dfm)$$7;
            $$6.a($$9);
            $$3.a(new biy(($$1x, $$2x, $$3x) -> cgl.a($$1x, $$2x, $$6), f));
            $$3.a(aqx.aj);
            ccd.a($$3, true);
            return biq.b;
         }
      } else {
         return biq.a($$1.B);
      }
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dfm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return $$0.B ? a($$2, det.d, dfm::a) : null;
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
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
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(c, d);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(d) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      der $$4 = $$1.c_($$2);
      if ($$4 instanceof dfm) {
         ((dfm)$$4).c();
      }
   }
}
