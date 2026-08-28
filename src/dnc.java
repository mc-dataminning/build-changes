import com.mojang.serialization.MapCodec;

public class dnc extends dfi implements dfc {
   public static final MapCodec<dnc> a = b(dnc::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dtc c = dss.as;
   private static final ewk e = dez.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final ewk f = dez.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dnc> a() {
      return a;
   }

   public dnc(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return new cup(cus.wr);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dsc $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dsc $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dwv.c, $$2, dwv.a.a($$5));
      }
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, bsu $$3) {
      if ($$3 instanceof btp && $$3.ak() != bta.Q && $$3.ak() != bta.h) {
         $$3.a($$0, new evr(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ad != $$3.du() || $$3.af != $$3.dA())) {
            double $$4 = Math.abs($$3.du() - $$3.ad);
            double $$5 = Math.abs($$3.dA() - $$3.af);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.aj().s(), 1.0F);
            }
         }
      }
   }

   @Override
   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(cus.ry) ? bqw.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new cup(cus.wr, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awa.zp, awb.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dsc $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dwv.c, $$2, dwv.a.a($$3, $$8));
         return bqu.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
