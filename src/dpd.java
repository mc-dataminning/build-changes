import com.mojang.serialization.MapCodec;

public class dpd extends dgv {
   public static final MapCodec<dpd> a = b(dpd::new);
   private static final dva b = duq.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dpd> a() {
      return a;
   }

   public dpd(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dds $$0, dua $$1, eya $$2, coi $$3) {
      int $$4 = a((ddt)$$0, $$1, $$2, (btj)$$3);
      if ($$3.s() instanceof arh $$6) {
         $$6.a(awn.aE);
         an.M.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(ddt $$0, dua $$1, eya $$2, btj $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cnw ? 20 : 8;
      if (!$$0.R().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(eya $$0, eye $$1) {
      jj $$2 = $$0.b();
      double $$3 = Math.abs(azc.e($$1.d) - 0.5);
      double $$4 = Math.abs(azc.e($$1.e) - 0.5);
      double $$5 = Math.abs(azc.e($$1.f) - 0.5);
      jj.a $$6 = $$2.o();
      double $$7;
      if ($$6 == jj.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == jj.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, azc.c(15.0 * azc.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(ddt $$0, dua $$1, int $$2, je $$3, int $$4) {
      $$0.a($$3, $$1.b(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dua $$0, dcx $$1, je $$2, jj $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(dua $$0) {
      return true;
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.R().a($$2, this)) {
            $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
