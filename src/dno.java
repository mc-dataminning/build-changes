import com.mojang.serialization.MapCodec;

public class dno extends dfh {
   public static final MapCodec<dno> a = b(dno::new);
   private static final dtk b = dta.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dno> a() {
      return a;
   }

   public dno(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dcf $$0, dsk $$1, ewb $$2, cnc $$3) {
      int $$4 = a((dcg)$$0, $$1, $$2, (bsg)$$3);
      if ($$3.s() instanceof aqn $$6) {
         $$6.a(avr.aE);
         am.M.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(dcg $$0, dsk $$1, ewb $$2, bsg $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cmq ? 20 : 8;
      if (!$$0.P().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(ewb $$0, ewf $$1) {
      jf $$2 = $$0.b();
      double $$3 = Math.abs(ayg.e($$1.c) - 0.5);
      double $$4 = Math.abs(ayg.e($$1.d) - 0.5);
      double $$5 = Math.abs(ayg.e($$1.e) - 0.5);
      jf.a $$6 = $$2.o();
      double $$7;
      if ($$6 == jf.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == jf.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, ayg.c(15.0 * ayg.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dcg $$0, dsk $$1, int $$2, ja $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean e_(dsk $$0) {
      return true;
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
