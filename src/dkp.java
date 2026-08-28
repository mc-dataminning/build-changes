import com.mojang.serialization.MapCodec;

public class dkp extends dkl {
   public static final MapCodec<dkp> a = b(dkp::new);
   private static final double c = 0.13;
   private static final double e = 0.08;
   private static final double f = 0.05;
   private static final int g = 20;
   protected static final eyx b = dgv.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<dkp> a() {
      return a;
   }

   public dkp(dtz.d $$0) {
      super($$0);
   }

   private static boolean c(btj $$0) {
      return $$0 instanceof buf || $$0 instanceof cpm || $$0 instanceof cka || $$0 instanceof cpo;
   }

   @Override
   protected eyx b(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return b;
   }

   @Override
   public void a(dds $$0, dua $$1, je $$2, btj $$3, float $$4) {
      $$3.a(awd.mB, 1.0F, 1.0F);
      if (!$$0.B) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.ak().l())) {
         $$3.a(this.aJ.g(), this.aJ.a() * 0.5F, this.aJ.b() * 0.75F);
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(je $$0, btj $$1) {
      if ($$1.aH()) {
         return false;
      } else if ($$1.dz() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if ($$1.dv().e >= -0.08) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.dx());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dD());
         double $$4 = 0.4375 + (double)($$1.dn() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(btj $$0, je $$1) {
      if ($$0 instanceof arh && $$0.dS().aa() % 20L == 0L) {
         an.K.a((arh)$$0, $$0.dS().a_($$1));
      }
   }

   private void d(btj $$0) {
      eye $$1 = $$0.dv();
      if ($$1.e < -0.13) {
         double $$2 = -0.05 / $$1.e;
         $$0.h(new eye($$1.d * $$2, -0.05, $$1.f * $$2));
      } else {
         $$0.h(new eye($$1.d, -0.05, $$1.f));
      }

      $$0.n();
   }

   private void a(dds $$0, btj $$1) {
      if (c($$1)) {
         if ($$0.z.a(5) == 0) {
            $$1.a(awd.mB, 1.0F, 1.0F);
         }

         if (!$$0.B && $$0.z.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(btj $$0) {
      a($$0, 5);
   }

   public static void b(btj $$0) {
      a($$0, 10);
   }

   private static void a(btj $$0, int $$1) {
      if ($$0.dS().B) {
         dua $$2 = dgx.pg.o();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dS().a(new lf(ln.b, $$2), $$0.dx(), $$0.dz(), $$0.dD(), 0.0, 0.0, 0.0);
         }
      }
   }
}
