import com.mojang.serialization.MapCodec;

public class dml extends dix {
   public static final MapCodec<dml> a = b(dml::new);

   @Override
   public MapCodec<dml> a() {
      return a;
   }

   public dml(dsj.d $$0) {
      super($$0);
   }

   @Override
   public void a(dcf $$0, dsk $$1, ja $$2, bsg $$3, float $$4) {
      if ($$3.bY()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.aj().l());
      }
   }

   @Override
   public void a(dbl $$0, bsg $$1) {
      if ($$1.bY()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bsg $$0) {
      ewf $$1 = $$0.dt();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof btb ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(dcf $$0, ja $$1, dsk $$2, bsg $$3) {
      double $$4 = Math.abs($$3.dt().d);
      if ($$4 < 0.1 && !$$3.bX()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.i($$3.dt().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
