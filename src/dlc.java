import com.mojang.serialization.MapCodec;

public class dlc extends dho {
   public static final MapCodec<dlc> a = b(dlc::new);

   @Override
   public MapCodec<dlc> a() {
      return a;
   }

   public dlc(dra.d $$0) {
      super($$0);
   }

   @Override
   public void a(dax $$0, drb $$1, io $$2, bru $$3, float $$4) {
      if ($$3.bX()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ai().k());
      }
   }

   @Override
   public void a(dad $$0, bru $$1) {
      if ($$1.bX()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bru $$0) {
      euk $$1 = $$0.ds();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bso ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(dax $$0, io $$1, drb $$2, bru $$3) {
      double $$4 = Math.abs($$3.ds().d);
      if ($$4 < 0.1 && !$$3.bW()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.g($$3.ds().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
