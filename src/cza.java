import com.mojang.serialization.MapCodec;

public class cza extends cyo {
   public static final MapCodec<cza> a = b(cza::new);
   public static final int b = 6;
   public static final dmf c = dlv.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final eol[] g = new eol[]{
      cyo.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cyo.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cyo.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cyo.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cyo.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cyo.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cyo.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<cza> a() {
      return a;
   }

   protected cza(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      cou $$7 = $$0.d();
      if ($$0.a(auh.ai) && $$1.c(c) == 0 && cyo.a($$7) instanceof czd $$8) {
         if (!$$4.f()) {
            $$0.h(1);
         }

         $$2.a(null, $$3, atk.di, atl.e, 1.0F, 1.0F);
         $$2.b($$3, cze.a($$8));
         $$2.a($$4, dpp.c, $$3);
         $$4.b(atu.c.b($$7));
         return blw.a;
      } else {
         return blw.d;
      }
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return blu.a;
         }

         if ($$3.b(blt.a).b()) {
            return blu.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static blu a(cvo $$0, hz $$1, dlf $$2, chh $$3) {
      if (!$$3.s(false)) {
         return blu.d;
      } else {
         $$3.a(atu.U);
         $$3.gd().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dpp.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dpp.f, $$1);
         }

         return blu.a;
      }
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return $$1 == ie.a && !$$0.a($$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }
}
