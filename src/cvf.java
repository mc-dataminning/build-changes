import com.mojang.serialization.MapCodec;

public class cvf extends cut {
   public static final MapCodec<cvf> a = b(cvf::new);
   public static final int b = 6;
   public static final dhw c = dhm.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final ekb[] g = new ekb[]{
      cut.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cut.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cut.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cut.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cut.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cut.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cut.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<cvf> a() {
      return a;
   }

   protected cvf(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return g[$$0.c(c)];
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      clb $$6 = $$3.b($$4);
      ckw $$7 = $$6.d();
      if ($$6.a(ark.ai) && $$0.c(c) == 0) {
         cut $$8 = cut.a($$7);
         if ($$8 instanceof cvi) {
            if (!$$3.f()) {
               $$6.h(1);
            }

            $$1.a(null, $$2, aqn.cK, aqo.e, 1.0F, 1.0F);
            $$1.b($$2, cvj.a($$8));
            $$1.a($$3, dlg.c, $$2);
            $$3.b(aqx.c.b($$7));
            return biq.a;
         }
      }

      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return biq.a;
         }

         if ($$6.b()) {
            return biq.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static biq a(crt $$0, ht $$1, dgw $$2, cdm $$3) {
      if (!$$3.t(false)) {
         return biq.d;
      } else {
         $$3.a(aqx.U);
         $$3.gc().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dlg.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dlg.f, $$1);
         }

         return biq.a;
      }
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return $$1 == hx.a && !$$0.a($$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(c);
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}
