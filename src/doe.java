import com.mojang.serialization.MapCodec;

public class doe extends dfw {
   public static final MapCodec<doe> a = b(doe::new);
   private static final dua b = dtq.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<doe> a() {
      return a;
   }

   public doe(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dcu $$0, dta $$1, ews $$2, cnn $$3) {
      int $$4 = a((dcv)$$0, $$1, $$2, (bsq)$$3);
      if ($$3.s() instanceof aqu $$6) {
         $$6.a(avy.aE);
         an.M.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(dcv $$0, dta $$1, ews $$2, bsq $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cnb ? 20 : 8;
      if (!$$0.P().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(ews $$0, eww $$1) {
      ji $$2 = $$0.b();
      double $$3 = Math.abs(ayn.e($$1.c) - 0.5);
      double $$4 = Math.abs(ayn.e($$1.d) - 0.5);
      double $$5 = Math.abs(ayn.e($$1.e) - 0.5);
      ji.a $$6 = $$2.o();
      double $$7;
      if ($$6 == ji.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == ji.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, ayn.c(15.0 * ayn.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dcv $$0, dta $$1, int $$2, jd $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dta $$0, dca $$1, jd $$2, ji $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean e_(dta $$0) {
      return true;
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
