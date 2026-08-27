import com.mojang.serialization.MapCodec;

public class dle extends dhq {
   public static final MapCodec<dle> a = b(dle::new);

   @Override
   public MapCodec<dle> a() {
      return a;
   }

   public dle(drc.d $$0) {
      super($$0);
   }

   @Override
   public void a(daz $$0, drd $$1, io $$2, brw $$3, float $$4) {
      if ($$3.bX()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ai().k());
      }
   }

   @Override
   public void a(daf $$0, brw $$1) {
      if ($$1.bX()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(brw $$0) {
      eum $$1 = $$0.ds();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bsq ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(daz $$0, io $$1, drd $$2, brw $$3) {
      double $$4 = Math.abs($$3.ds().d);
      if ($$4 < 0.1 && !$$3.bW()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.g($$3.ds().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
