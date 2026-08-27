import com.mojang.serialization.MapCodec;

public class ddc extends cvj implements cvd {
   public static final MapCodec<ddc> a = b(ddc::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dii c = dhy.as;
   private static final ekn e = cva.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final ekn f = cva.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<ddc> a() {
      return a;
   }

   public ddc(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public clj a(csd $$0, ht $$1, dhi $$2) {
      return new clj(clm.wh);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(dhi $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dhi $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dls.c, $$2, dls.a.a($$5));
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, bkq $$3) {
      if ($$3 instanceof blg && $$3.ai() != bku.N && $$3.ai() != bku.h) {
         $$3.a($$0, new eju(0.8F, 0.75, 0.8F));
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
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      int $$6 = $$0.c(c);
      boolean $$7 = $$6 == 3;
      if (!$$7 && $$3.b($$4).a(clm.rv)) {
         return bix.d;
      } else if ($$6 > 1) {
         int $$8 = 1 + $$1.z.a(2);
         a($$1, $$2, new clj(clm.wh, $$8 + ($$7 ? 1 : 0)));
         $$1.a(null, $$2, aqr.ya, aqs.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dhi $$9 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$9, 2);
         $$1.a(dls.c, $$2, dls.a.a($$3, $$9));
         return bix.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
