import com.mojang.serialization.MapCodec;

public class dng extends dez {
   public static final MapCodec<dng> a = b(dng::new);
   private static final dtc b = dss.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   public dng(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dby $$0, dsc $$1, evn $$2, cnp $$3) {
      int $$4 = a((dbz)$$0, $$1, $$2, (bsu)$$3);
      if ($$3.s() instanceof arg $$6) {
         $$6.a(awk.aE);
         am.M.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(dbz $$0, dsc $$1, evn $$2, bsu $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cnd ? 20 : 8;
      if (!$$0.P().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(evn $$0, evr $$1) {
      je $$2 = $$0.b();
      double $$3 = Math.abs(ayz.e($$1.c) - 0.5);
      double $$4 = Math.abs(ayz.e($$1.d) - 0.5);
      double $$5 = Math.abs(ayz.e($$1.e) - 0.5);
      je.a $$6 = $$2.o();
      double $$7;
      if ($$6 == je.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == je.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, ayz.c(15.0 * ayz.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dbz $$0, dsc $$1, int $$2, iz $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dsc $$0, dbe $$1, iz $$2, je $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean e_(dsc $$0) {
      return true;
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
