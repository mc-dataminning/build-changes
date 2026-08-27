import com.mojang.serialization.MapCodec;

public class dck extends dby {
   public static final MapCodec<dck> a = b(dck::new);
   public static final int b = 6;
   public static final dpz c = dpp.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final est[] g = new est[]{
      dby.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dby.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dby.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dby.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dby.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dby.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dby.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dck> a() {
      return a;
   }

   protected dck(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      cre $$7 = $$0.f();
      if ($$0.a(avk.ai) && $$1.c(c) == 0 && dby.a($$7) instanceof dcn $$8) {
         if (!$$4.f()) {
            $$0.g(1);
         }

         $$2.a(null, $$3, aum.dr, aun.e, 1.0F, 1.0F);
         $$2.b($$3, dco.a($$8));
         $$2.a($$4, dts.c, $$3);
         $$4.b(auw.c.b($$7));
         return boc.a;
      } else {
         return boc.d;
      }
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return boa.a;
         }

         if ($$3.b(bnz.a).d()) {
            return boa.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static boa a(cyy $$0, ib $$1, doz $$2, cjt $$3) {
      if (!$$3.s(false)) {
         return boa.d;
      } else {
         $$3.a(auw.U);
         $$3.gj().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dts.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dts.f, $$1);
         }

         return boa.a;
      }
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !$$0.a($$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
