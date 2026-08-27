import com.mojang.serialization.MapCodec;

public class ddh extends cvo implements cvi {
   public static final MapCodec<ddh> a = b(ddh::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final din c = did.as;
   private static final eks e = cvf.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final eks f = cvf.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<ddh> a() {
      return a;
   }

   public ddh(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      return new clo(clr.wh);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(dhn $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dhn $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dlx.c, $$2, dlx.a.a($$5));
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
      if ($$3 instanceof bll && $$3.ai() != bkz.N && $$3.ai() != bkz.h) {
         $$3.a($$0, new ejz(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ac != $$3.ds() || $$3.ae != $$3.dy())) {
            double $$4 = Math.abs($$3.ds() - $$3.ac);
            double $$5 = Math.abs($$3.dy() - $$3.ae);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ah().s(), 1.0F);
            }
         }
      }
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      int $$6 = $$0.c(c);
      boolean $$7 = $$6 == 3;
      if (!$$7 && $$3.b($$4).a(clr.rv)) {
         return bjb.d;
      } else if ($$6 > 1) {
         int $$8 = 1 + $$1.z.a(2);
         a($$1, $$2, new clo(clr.wh, $$8 + ($$7 ? 1 : 0)));
         $$1.a(null, $$2, aqv.ya, aqw.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dhn $$9 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$9, 2);
         $$1.a(dlx.c, $$2, dlx.a.a($$3, $$9));
         return bjb.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
