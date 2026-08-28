import com.mojang.serialization.MapCodec;

public class dfr extends dff {
   public static final MapCodec<dfr> a = b(dfr::new);
   public static final int b = 6;
   public static final dth c = dsx.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final ews[] g = new ews[]{
      dff.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dff.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dff.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dff.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dff.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dff.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dff.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dfr> a() {
      return a;
   }

   protected dfr(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      ctv $$7 = $$0.g();
      if ($$0.a(awd.aJ) && $$1.c(c) == 0 && dff.a($$7) instanceof dfu $$8) {
         if (!$$4.f()) {
            $$0.h(1);
         }

         $$2.a(null, $$3, avf.dr, avg.e, 1.0F, 1.0F);
         $$2.b($$3, dfv.a($$8));
         $$2.a($$4, dxa.c, $$3);
         $$4.b(avp.c.b($$7));
         return bqf.a;
      } else {
         return bqf.d;
      }
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bqd.a;
         }

         if ($$3.b(bqc.a).e()) {
            return bqd.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bqd a(dce $$0, ja $$1, dsh $$2, cmh $$3) {
      if (!$$3.t(false)) {
         return bqd.e;
      } else {
         $$3.a(avp.U);
         $$3.gi().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dxa.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dxa.f, $$1);
         }

         return bqd.a;
      }
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !$$0.a($$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}
