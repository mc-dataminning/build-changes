import com.mojang.serialization.MapCodec;

public class dmc extends dio {
   public static final MapCodec<dmc> a = b(dmc::new);

   @Override
   public MapCodec<dmc> a() {
      return a;
   }

   public dmc(dsa.d $$0) {
      super($$0);
   }

   @Override
   public void a(dbx $$0, dsb $$1, iz $$2, bst $$3, float $$4) {
      if ($$3.bX()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.aj().k());
      }
   }

   @Override
   public void a(dbd $$0, bst $$1) {
      if ($$1.bX()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bst $$0) {
      evq $$1 = $$0.ds();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bto ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(dbx $$0, iz $$1, dsb $$2, bst $$3) {
      double $$4 = Math.abs($$3.ds().d);
      if ($$4 < 0.1 && !$$3.bW()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.h($$3.ds().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
