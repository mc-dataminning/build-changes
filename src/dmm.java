import com.mojang.serialization.MapCodec;

public class dmm extends diy {
   public static final MapCodec<dmm> a = b(dmm::new);

   @Override
   public MapCodec<dmm> a() {
      return a;
   }

   public dmm(dsk.d $$0) {
      super($$0);
   }

   @Override
   public void a(dcg $$0, dsl $$1, ja $$2, bsh $$3, float $$4) {
      if ($$3.bZ()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.aj().l());
      }
   }

   @Override
   public void a(dbm $$0, bsh $$1) {
      if ($$1.bZ()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bsh $$0) {
      ewh $$1 = $$0.du();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof btc ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(dcg $$0, ja $$1, dsl $$2, bsh $$3) {
      double $$4 = Math.abs($$3.du().d);
      if ($$4 < 0.1 && !$$3.bY()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.j($$3.du().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
