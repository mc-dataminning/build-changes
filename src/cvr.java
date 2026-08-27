import com.mojang.serialization.MapCodec;

public class cvr extends cvf {
   public static final MapCodec<cvr> a = b(cvr::new);
   public static final int b = 6;
   public static final din c = did.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final eks[] g = new eks[]{
      cvf.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cvf.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cvf.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cvf.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cvf.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cvf.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cvf.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<cvr> a() {
      return a;
   }

   protected cvr(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return g[$$0.c(c)];
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      clo $$6 = $$3.b($$4);
      clj $$7 = $$6.d();
      if ($$6.a(ars.ai) && $$0.c(c) == 0) {
         cvf $$8 = cvf.a($$7);
         if ($$8 instanceof cvu) {
            if (!$$3.f()) {
               $$6.h(1);
            }

            $$1.a(null, $$2, aqv.cK, aqw.e, 1.0F, 1.0F);
            $$1.b($$2, cvv.a($$8));
            $$1.a($$3, dlx.c, $$2);
            $$3.b(arf.c.b($$7));
            return bjb.a;
         }
      }

      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bjb.a;
         }

         if ($$6.b()) {
            return bjb.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bjb a(csg $$0, hx $$1, dhn $$2, cdz $$3) {
      if (!$$3.t(false)) {
         return bjb.d;
      } else {
         $$3.a(arf.U);
         $$3.gd().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dlx.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dlx.f, $$1);
         }

         return bjb.a;
      }
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return $$1 == ib.a && !$$0.a($$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c);
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}
