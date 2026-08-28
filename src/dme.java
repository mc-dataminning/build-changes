import com.mojang.serialization.MapCodec;

public class dme extends diq {
   public static final MapCodec<dme> a = b(dme::new);

   @Override
   public MapCodec<dme> a() {
      return a;
   }

   public dme(dsc.d $$0) {
      super($$0);
   }

   @Override
   public void a(dbz $$0, dsd $$1, iz $$2, bsv $$3, float $$4) {
      if ($$3.bX()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.aj().k());
      }
   }

   @Override
   public void a(dbf $$0, bsv $$1) {
      if ($$1.bX()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bsv $$0) {
      evs $$1 = $$0.ds();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof btq ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(dbz $$0, iz $$1, dsd $$2, bsv $$3) {
      double $$4 = Math.abs($$3.ds().d);
      if ($$4 < 0.1 && !$$3.bW()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.h($$3.ds().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
