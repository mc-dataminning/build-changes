import com.mojang.serialization.MapCodec;

public class dny extends dfc {
   public static final MapCodec<dny> a = b(dny::new);
   private static final duc b = dts.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dny> a() {
      return a;
   }

   public dny(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dca $$0, dtc $$1, ewq $$2, cms $$3) {
      int $$4 = a((dcb)$$0, $$1, $$2, (brv)$$3);
      if ($$3.t() instanceof aqu $$6) {
         $$6.a(avz.aF);
         an.M.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(dcb $$0, dtc $$1, ewq $$2, brv $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cme ? 20 : 8;
      if (!$$0.P().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(ewq $$0, ewu $$1) {
      iw $$2 = $$0.b();
      double $$3 = Math.abs(aym.e($$1.c) - 0.5);
      double $$4 = Math.abs(aym.e($$1.d) - 0.5);
      double $$5 = Math.abs(aym.e($$1.e) - 0.5);
      iw.a $$6 = $$2.o();
      double $$7;
      if ($$6 == iw.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == iw.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, aym.c(15.0 * aym.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dcb $$0, dtc $$1, int $$2, ir $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
