import com.mojang.serialization.MapCodec;

public class dmf extends ddy {
   public static final MapCodec<dmf> a = b(dmf::new);
   private static final dsb b = drr.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dmf> a() {
      return a;
   }

   public dmf(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dax $$0, drb $$1, eug $$2, cmo $$3) {
      int $$4 = a((day)$$0, $$1, $$2, (bru)$$3);
      if ($$3.s() instanceof aqn $$6) {
         $$6.a(avr.aE);
         am.M.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(day $$0, drb $$1, eug $$2, bru $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cmc ? 20 : 8;
      if (!$$0.O().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(eug $$0, euk $$1) {
      it $$2 = $$0.b();
      double $$3 = Math.abs(ayd.e($$1.c) - 0.5);
      double $$4 = Math.abs(ayd.e($$1.d) - 0.5);
      double $$5 = Math.abs(ayd.e($$1.e) - 0.5);
      it.a $$6 = $$2.o();
      double $$7;
      if ($$6 == it.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == it.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, ayd.c(15.0 * ayd.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(day $$0, drb $$1, int $$2, io $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(drb $$0, dad $$1, io $$2, it $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean e_(drb $$0) {
      return true;
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.O().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
