import com.mojang.serialization.MapCodec;

public class dux extends dmf {
   public static final MapCodec<dux> a = b(dux::new);
   private static final ebh b = eax.aW;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dux> a() {
      return a;
   }

   public dux(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dja $$0, eah $$1, fem $$2, crx $$3) {
      int $$4 = a((djb)$$0, $$1, $$2, (bwf)$$3);
      if ($$3.q() instanceof arr $$6) {
         $$6.a(awx.aE);
         ap.M.a($$6, $$3, $$2.g(), $$4);
      }
   }

   private static int a(djb $$0, eah $$1, fem $$2, bwf $$3) {
      int $$4 = a($$2, $$2.g());
      int $$5 = $$3 instanceof crk ? 20 : 8;
      if (!$$0.U().a($$2.b(), $$1.b())) {
         a($$0, $$1, $$4, $$2.b(), $$5);
      }

      return $$4;
   }

   private static int a(fem $$0, feq $$1) {
      ja $$2 = $$0.c();
      double $$3 = Math.abs(azm.e($$1.d) - 0.5);
      double $$4 = Math.abs(azm.e($$1.e) - 0.5);
      double $$5 = Math.abs(azm.e($$1.f) - 0.5);
      ja.a $$6 = $$2.o();
      double $$7;
      if ($$6 == ja.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == ja.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, azm.c(15.0 * azm.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(djb $$0, eah $$1, int $$2, iu $$3, int $$4) {
      $$0.a($$3, $$1.b(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(eah $$0, dig $$1, iu $$2, ja $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(eah $$0) {
      return true;
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
