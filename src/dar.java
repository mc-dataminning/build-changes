import com.mojang.serialization.MapCodec;

public class dar extends dao {
   public static final MapCodec<dar> a = b(dar::new);
   private static final double c = 0.13;
   private static final double e = 0.08;
   private static final double f = 0.05;
   private static final int g = 20;
   protected static final emv b = cwy.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<dar> a() {
      return a;
   }

   public dar(djo.d $$0) {
      super($$0);
   }

   private static boolean c(blw $$0) {
      return $$0 instanceof bmo || $$0 instanceof chi || $$0 instanceof ccc || $$0 instanceof chk;
   }

   @Override
   public emv b(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return b;
   }

   @Override
   public void a(ctx $$0, djp $$1, hx $$2, blw $$3, float $$4) {
      $$3.a(art.mb, 1.0F, 1.0F);
      if (!$$0.B) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.ai().k())) {
         $$3.a(this.aJ.g(), this.aJ.a() * 0.5F, this.aJ.b() * 0.75F);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(hx $$0, blw $$1) {
      if ($$1.aC()) {
         return false;
      } else if ($$1.ds() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if ($$1.do().d >= -0.08) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.dq());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dw());
         double $$4 = 0.4375 + (double)($$1.dg() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(blw $$0, hx $$1) {
      if ($$0 instanceof anf && $$0.dL().X() % 20L == 0L) {
         am.K.a((anf)$$0, $$0.dL().a_($$1));
      }
   }

   private void d(blw $$0) {
      emc $$1 = $$0.do();
      if ($$1.d < -0.13) {
         double $$2 = -0.05 / $$1.d;
         $$0.g(new emc($$1.c * $$2, -0.05, $$1.e * $$2));
      } else {
         $$0.g(new emc($$1.c, -0.05, $$1.e));
      }

      $$0.n();
   }

   private void a(ctx $$0, blw $$1) {
      if (c($$1)) {
         if ($$0.z.a(5) == 0) {
            $$1.a(art.mb, 1.0F, 1.0F);
         }

         if (!$$0.B && $$0.z.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(blw $$0) {
      a($$0, 5);
   }

   public static void b(blw $$0) {
      a($$0, 10);
   }

   private static void a(blw $$0, int $$1) {
      if ($$0.dL().B) {
         djp $$2 = cxa.pg.o();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dL().a(new jp(jx.c, $$2), $$0.dq(), $$0.ds(), $$0.dw(), 0.0, 0.0, 0.0);
         }
      }
   }
}
