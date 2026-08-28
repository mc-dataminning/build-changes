import com.mojang.serialization.MapCodec;

public class dfu extends dfi {
   public static final MapCodec<dfu> a = b(dfu::new);
   public static final int b = 6;
   public static final dtl c = dtb.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final exa[] g = new exa[]{
      dfi.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfi.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfi.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfi.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfi.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfi.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfi.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dfu> a() {
      return a;
   }

   protected dfu(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      cty $$7 = $$0.g();
      if ($$0.a(awf.aJ) && $$1.c(c) == 0 && dfi.a($$7) instanceof dfx $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, avh.dr, avi.e, 1.0F, 1.0F);
         $$2.b($$3, dfy.a($$8));
         $$2.a($$4, dxh.c, $$3);
         $$4.b(avr.c.b($$7));
         return bqj.a;
      } else {
         return bqj.d;
      }
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bqh.a;
         }

         if ($$3.b(bqg.a).e()) {
            return bqh.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bqh a(dch $$0, ja $$1, dsl $$2, cml $$3) {
      if (!$$3.u(false)) {
         return bqh.e;
      } else {
         $$3.a(avr.U);
         $$3.gk().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dxh.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dxh.f, $$1);
         }

         return bqh.a;
      }
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !$$0.a($$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
