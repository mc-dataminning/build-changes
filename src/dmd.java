import com.mojang.serialization.MapCodec;

public class dmd extends dip {
   public static final MapCodec<dmd> a = b(dmd::new);

   @Override
   public MapCodec<dmd> a() {
      return a;
   }

   public dmd(dsb.d $$0) {
      super($$0);
   }

   @Override
   public void a(dby $$0, dsc $$1, iz $$2, bsu $$3, float $$4) {
      if ($$3.bX()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.aj().k());
      }
   }

   @Override
   public void a(dbe $$0, bsu $$1) {
      if ($$1.bX()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bsu $$0) {
      evr $$1 = $$0.ds();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof btp ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(dby $$0, iz $$1, dsc $$2, bsu $$3) {
      double $$4 = Math.abs($$3.ds().d);
      if ($$4 < 0.1 && !$$3.bW()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.h($$3.ds().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
