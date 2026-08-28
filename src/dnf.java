import com.mojang.serialization.MapCodec;

public class dnf extends dey {
   public static final MapCodec<dnf> a = b(dnf::new);
   private static final dtb b = dsr.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dnf> a() {
      return a;
   }

   public dnf(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dbx $$0, dsb $$1, evm $$2, cno $$3) {
      int $$4 = a((dby)$$0, $$1, $$2, (bst)$$3);
      if ($$3.s() instanceof arf $$6) {
         $$6.a(awj.aE);
         am.M.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(dby $$0, dsb $$1, evm $$2, bst $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cnc ? 20 : 8;
      if (!$$0.P().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(evm $$0, evq $$1) {
      je $$2 = $$0.b();
      double $$3 = Math.abs(ayy.e($$1.c) - 0.5);
      double $$4 = Math.abs(ayy.e($$1.d) - 0.5);
      double $$5 = Math.abs(ayy.e($$1.e) - 0.5);
      je.a $$6 = $$2.o();
      double $$7;
      if ($$6 == je.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == je.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, ayy.c(15.0 * ayy.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dby $$0, dsb $$1, int $$2, iz $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean e_(dsb $$0) {
      return true;
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
