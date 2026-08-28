import com.mojang.serialization.MapCodec;

public class dld extends dkz {
   public static final MapCodec<dld> a = b(dld::new);
   private static final double c = 0.13;
   private static final double e = 0.08;
   private static final double f = 0.05;
   private static final int g = 20;
   protected static final ezm b = dhj.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<dld> a() {
      return a;
   }

   public dld(dun.d $$0) {
      super($$0);
   }

   private static boolean c(bto $$0) {
      return $$0 instanceof buk || $$0 instanceof cps || $$0 instanceof ckf || $$0 instanceof cpu;
   }

   @Override
   protected ezm b(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return b;
   }

   @Override
   public void a(deg $$0, duo $$1, je $$2, bto $$3, float $$4) {
      $$3.a(awe.mB, 1.0F, 1.0F);
      if (!$$0.B) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.ak().l())) {
         $$3.a(this.aK.g(), this.aK.a() * 0.5F, this.aK.b() * 0.75F);
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(je $$0, bto $$1) {
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

   private void a(bto $$0, je $$1) {
      if ($$0 instanceof ari && $$0.dS().aa() % 20L == 0L) {
         an.K.a((ari)$$0, $$0.dS().a_($$1));
      }
   }

   private void d(bto $$0) {
      eys $$1 = $$0.dv();
      if ($$1.e < -0.13) {
         double $$2 = -0.05 / $$1.e;
         $$0.h(new eys($$1.d * $$2, -0.05, $$1.f * $$2));
      } else {
         $$0.h(new eys($$1.d, -0.05, $$1.f));
      }

      $$0.n();
   }

   private void a(deg $$0, bto $$1) {
      if (c($$1)) {
         if ($$0.z.a(5) == 0) {
            $$1.a(awe.mB, 1.0F, 1.0F);
         }

         if (!$$0.B && $$0.z.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bto $$0) {
      a($$0, 5);
   }

   public static void b(bto $$0) {
      a($$0, 10);
   }

   private static void a(bto $$0, int $$1) {
      if ($$0.dS().B) {
         duo $$2 = dhl.pg.o();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dS().a(new lf(ln.b, $$2), $$0.dx(), $$0.dz(), $$0.dD(), 0.0, 0.0, 0.0);
         }
      }
   }
}
