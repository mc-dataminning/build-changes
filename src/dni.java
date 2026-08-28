import com.mojang.serialization.MapCodec;

public class dni extends dfo implements dfi {
   public static final MapCodec<dni> a = b(dni::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dth c = dsx.as;
   private static final ews e = dff.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final ews f = dff.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dni> a() {
      return a;
   }

   public dni(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cua a(dcg $$0, ja $$1, dsh $$2) {
      return new cua(cud.wu);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dsh $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dsh $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dxa.c, $$2, dxa.a.a($$5));
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
      if ($$3 instanceof bsy && $$3.ak() != bsj.Q && $$3.ak() != bsj.h) {
         $$3.a($$0, new evz(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ad != $$3.du() || $$3.af != $$3.dA())) {
            double $$4 = Math.abs($$3.du() - $$3.ad);
            double $$5 = Math.abs($$3.dA() - $$3.af);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.aj().t(), 1.0F);
            }
         }
      }
   }

   @Override
   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(cud.ry) ? bqf.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new cua(cud.wu, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, avf.zs, avg.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dsh $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dxa.c, $$2, dxa.a.a($$3, $$8));
         return bqd.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
