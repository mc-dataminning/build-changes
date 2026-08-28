import com.mojang.serialization.MapCodec;

public class djc extends diy {
   public static final MapCodec<djc> a = b(djc::new);
   private static final double c = 0.13;
   private static final double e = 0.08;
   private static final double f = 0.05;
   private static final int g = 20;
   protected static final exa b = dfi.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<djc> a() {
      return a;
   }

   public djc(dsk.d $$0) {
      super($$0);
   }

   private static boolean c(bsh $$0) {
      return $$0 instanceof btc || $$0 instanceof cog || $$0 instanceof ciw || $$0 instanceof coi;
   }

   @Override
   protected exa b(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return b;
   }

   @Override
   public void a(dcg $$0, dsl $$1, ja $$2, bsh $$3, float $$4) {
      $$3.a(avh.mA, 1.0F, 1.0F);
      if (!$$0.B) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.aj().l())) {
         $$3.a(this.aJ.g(), this.aJ.a() * 0.5F, this.aJ.b() * 0.75F);
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, bsh $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(ja $$0, bsh $$1) {
      if ($$1.aG()) {
         return false;
      } else if ($$1.dy() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if ($$1.du().d >= -0.08) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.dw());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dC());
         double $$4 = 0.4375 + (double)($$1.dl() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(bsh $$0, ja $$1) {
      if ($$0 instanceof aqn && $$0.dR().Z() % 20L == 0L) {
         am.K.a((aqn)$$0, $$0.dR().a_($$1));
      }
   }

   private void d(bsh $$0) {
      ewh $$1 = $$0.du();
      if ($$1.d < -0.13) {
         double $$2 = -0.05 / $$1.d;
         $$0.j(new ewh($$1.c * $$2, -0.05, $$1.e * $$2));
      } else {
         $$0.j(new ewh($$1.c, -0.05, $$1.e));
      }

      $$0.n();
   }

   private void a(dcg $$0, bsh $$1) {
      if (c($$1)) {
         if ($$0.z.a(5) == 0) {
            $$1.a(avh.mA, 1.0F, 1.0F);
         }

         if (!$$0.B && $$0.z.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bsh $$0) {
      a($$0, 5);
   }

   public static void b(bsh $$0) {
      a($$0, 10);
   }

   private static void a(bsh $$0, int $$1) {
      if ($$0.dR().B) {
         dsl $$2 = dfk.pg.o();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dR().a(new lb(lj.b, $$2), $$0.dw(), $$0.dy(), $$0.dC(), 0.0, 0.0, 0.0);
         }
      }
   }
}
