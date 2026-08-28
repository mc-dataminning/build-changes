import com.mojang.serialization.MapCodec;

public class dmj extends div {
   public static final MapCodec<dmj> a = b(dmj::new);

   @Override
   public MapCodec<dmj> a() {
      return a;
   }

   public dmj(dsg.d $$0) {
      super($$0);
   }

   @Override
   public void a(dcd $$0, dsh $$1, ja $$2, bsd $$3, float $$4) {
      if ($$3.bX()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.aj().l());
      }
   }

   @Override
   public void a(dbj $$0, bsd $$1) {
      if ($$1.bX()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bsd $$0) {
      evz $$1 = $$0.ds();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bsy ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(dcd $$0, ja $$1, dsh $$2, bsd $$3) {
      double $$4 = Math.abs($$3.ds().d);
      if ($$4 < 0.1 && !$$3.bW()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.h($$3.ds().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
