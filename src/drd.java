import com.mojang.serialization.MapCodec;

public class drd extends dqy {
   public static final MapCodec<drd> a = b(drd::new);
   private static final double b = 0.13;
   private static final double c = 0.08;
   private static final double e = 0.05;
   private static final int f = 20;
   private static final fgm g = dne.b(14.0, 0.0, 15.0);

   @Override
   public MapCodec<drd> a() {
      return a;
   }

   public drd(ebf.d $$0) {
      super($$0);
   }

   private static boolean c(bwv $$0) {
      return $$0 instanceof bxw || $$0 instanceof cum || $$0 instanceof cof || $$0 instanceof cuk;
   }

   @Override
   protected fgm b(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return g;
   }

   @Override
   public void a(djz $$0, ebg $$1, iw $$2, bwv $$3, double $$4) {
      $$3.a(awr.nc, 1.0F, 1.0F);
      if (!$$0.C) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.al().l())) {
         $$3.a(this.I.g(), this.I.a() * 0.5F, this.I.b() * 0.75F);
      }
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private static double b(double $$0) {
      return $$0 / 0.98F + 0.08;
   }

   private static double c(double $$0) {
      return ($$0 - 0.08) * 0.98F;
   }

   private boolean a(iw $$0, bwv $$1) {
      if ($$1.aH()) {
         return false;
      } else if ($$1.dC() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if (b($$1.dy().e) >= -0.08) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.dA());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dG());
         double $$4 = 0.4375 + (double)($$1.dq() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(bwv $$0, iw $$1) {
      if ($$0 instanceof arv && $$0.dV().ae() % 20L == 0L) {
         aq.K.a((arv)$$0, $$0.dV().a_($$1));
      }
   }

   private void d(bwv $$0) {
      ffs $$1 = $$0.dy();
      if (b($$0.dy().e) < -0.13) {
         double $$2 = -0.05 / b($$0.dy().e);
         $$0.i(new ffs($$1.d * $$2, c(-0.05), $$1.f * $$2));
      } else {
         $$0.i(new ffs($$1.d, c(-0.05), $$1.f));
      }

      $$0.k();
   }

   private void a(djz $$0, bwv $$1) {
      if (c($$1)) {
         if ($$0.A.a(5) == 0) {
            $$1.a(awr.nc, 1.0F, 1.0F);
         }

         if (!$$0.C && $$0.A.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bwv $$0) {
      a($$0, 5);
   }

   public static void b(bwv $$0) {
      a($$0, 10);
   }

   private static void a(bwv $$0, int $$1) {
      if ($$0.dV().C) {
         ebg $$2 = dng.pO.m();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dV().a(new lr(lz.b, $$2), $$0.dA(), $$0.dC(), $$0.dG(), 0.0, 0.0, 0.0);
         }
      }
   }
}
