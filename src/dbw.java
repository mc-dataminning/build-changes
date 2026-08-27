import com.mojang.serialization.MapCodec;

public class dbw extends cyj {
   public static final MapCodec<dbw> a = b(dbw::new);

   @Override
   public MapCodec<dbw> a() {
      return a;
   }

   public dbw(dgv.d $$0) {
      super($$0);
   }

   @Override
   public void a(crs $$0, dgw $$1, ht $$2, bki $$3, float $$4) {
      if ($$3.bT()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ag().k());
      }
   }

   @Override
   public void a(cqy $$0, bki $$1) {
      if ($$1.bT()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bki $$0) {
      eji $$1 = $$0.do();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bky ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bki $$3) {
      double $$4 = Math.abs($$3.do().d);
      if ($$4 < 0.1 && !$$3.bS()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.f($$3.do().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
