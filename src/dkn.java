import com.mojang.serialization.MapCodec;

public class dkn extends dch {
   public static final MapCodec<dkn> a = b(dkn::new);
   private static final dqi b = dpy.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dkn> a() {
      return a;
   }

   public dkn(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(czg $$0, dpi $$1, esf $$2, cks $$3) {
      int $$4 = a((czh)$$0, $$1, $$2, (bqa)$$3);
      if ($$3.u() instanceof apv $$6) {
         $$6.a(auz.aE);
         am.M.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(czh $$0, dpi $$1, esf $$2, bqa $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof ckg ? 20 : 8;
      if (!$$0.O().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(esf $$0, esj $$1) {
      ij $$2 = $$0.b();
      double $$3 = Math.abs(axm.e($$1.c) - 0.5);
      double $$4 = Math.abs(axm.e($$1.d) - 0.5);
      double $$5 = Math.abs(axm.e($$1.e) - 0.5);
      ij.a $$6 = $$2.o();
      double $$7;
      if ($$6 == ij.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == ij.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, axm.c(15.0 * axm.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(czh $$0, dpi $$1, int $$2, id $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dpi $$0, cym $$1, id $$2, ij $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(dpi $$0) {
      return true;
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.O().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
