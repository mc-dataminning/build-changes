import com.mojang.serialization.MapCodec;

public class dke extends dby {
   public static final MapCodec<dke> a = b(dke::new);
   private static final dpz b = dpp.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dke> a() {
      return a;
   }

   public dke(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(cyx $$0, doz $$1, erw $$2, ckl $$3) {
      int $$4 = a((cyy)$$0, $$1, $$2, (bpv)$$3);
      if ($$3.u() instanceof apt $$6) {
         $$6.a(auw.aE);
         am.M.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(cyy $$0, doz $$1, erw $$2, bpv $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cjz ? 20 : 8;
      if (!$$0.O().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(erw $$0, esa $$1) {
      ih $$2 = $$0.b();
      double $$3 = Math.abs(axk.e($$1.c) - 0.5);
      double $$4 = Math.abs(axk.e($$1.d) - 0.5);
      double $$5 = Math.abs(axk.e($$1.e) - 0.5);
      ih.a $$6 = $$2.o();
      double $$7;
      if ($$6 == ih.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == ih.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, axk.c(15.0 * axk.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(cyy $$0, doz $$1, int $$2, ib $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(doz $$0) {
      return true;
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.O().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
