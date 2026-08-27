import com.mojang.serialization.MapCodec;

public class dcy extends dcv {
   public static final MapCodec<dcy> a = b(dcy::new);
   private static final double c = 0.13;
   private static final double e = 0.08;
   private static final double f = 0.05;
   private static final int g = 20;
   protected static final epo b = czf.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<dcy> a() {
      return a;
   }

   public dcy(dmd.d $$0) {
      super($$0);
   }

   private static boolean c(bof $$0) {
      return $$0 instanceof box || $$0 instanceof cjt || $$0 instanceof cem || $$0 instanceof cjv;
   }

   @Override
   protected epo b(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return b;
   }

   @Override
   public void a(cwe $$0, dme $$1, ib $$2, bof $$3, float $$4) {
      $$3.a(atp.mc, 1.0F, 1.0F);
      if (!$$0.B) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.ah().k())) {
         $$3.a(this.aJ.g(), this.aJ.a() * 0.5F, this.aJ.b() * 0.75F);
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(ib $$0, bof $$1) {
      if ($$1.aC()) {
         return false;
      } else if ($$1.dq() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if ($$1.dm().d >= -0.08) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.do());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.du());
         double $$4 = 0.4375 + (double)($$1.dd() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(bof $$0, ib $$1) {
      if ($$0 instanceof apb && $$0.dJ().X() % 20L == 0L) {
         am.K.a((apb)$$0, $$0.dJ().a_($$1));
      }
   }

   private void d(bof $$0) {
      eov $$1 = $$0.dm();
      if ($$1.d < -0.13) {
         double $$2 = -0.05 / $$1.d;
         $$0.g(new eov($$1.c * $$2, -0.05, $$1.e * $$2));
      } else {
         $$0.g(new eov($$1.c, -0.05, $$1.e));
      }

      $$0.n();
   }

   private void a(cwe $$0, bof $$1) {
      if (c($$1)) {
         if ($$0.z.a(5) == 0) {
            $$1.a(atp.mc, 1.0F, 1.0F);
         }

         if (!$$0.B && $$0.z.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bof $$0) {
      a($$0, 5);
   }

   public static void b(bof $$0) {
      a($$0, 10);
   }

   private static void a(bof $$0, int $$1) {
      if ($$0.dJ().B) {
         dme $$2 = czh.pg.o();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dJ().a(new jt(kb.c, $$2), $$0.do(), $$0.dq(), $$0.du(), 0.0, 0.0, 0.0);
         }
      }
   }
}
