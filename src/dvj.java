import com.mojang.serialization.MapCodec;

public class dvj extends dmr {
   public static final MapCodec<dvj> a = b(dvj::new);
   private static final ebt b = ebj.aW;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dvj> a() {
      return a;
   }

   public dvj(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(djm $$0, eat $$1, fey $$2, csh $$3) {
      int $$4 = a((djn)$$0, $$1, $$2, (bwi)$$3);
      if ($$3.q() instanceof arr $$6) {
         $$6.a(awx.aE);
         aq.M.a($$6, $$3, $$2.g(), $$4);
      }
   }

   private static int a(djn $$0, eat $$1, fey $$2, bwi $$3) {
      int $$4 = a($$2, $$2.g());
      int $$5 = $$3 instanceof cru ? 20 : 8;
      if (!$$0.U().a($$2.b(), $$1.b())) {
         a($$0, $$1, $$4, $$2.b(), $$5);
      }

      return $$4;
   }

   private static int a(fey $$0, ffc $$1) {
      jb $$2 = $$0.c();
      double $$3 = Math.abs(azm.e($$1.d) - 0.5);
      double $$4 = Math.abs(azm.e($$1.e) - 0.5);
      double $$5 = Math.abs(azm.e($$1.f) - 0.5);
      jb.a $$6 = $$2.o();
      double $$7;
      if ($$6 == jb.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == jb.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, azm.c(15.0 * azm.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(djn $$0, eat $$1, int $$2, iv $$3, int $$4) {
      $$0.a($$3, $$1.b(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(eat $$0, diq $$1, iv $$2, jb $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(eat $$0) {
      return true;
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
