import com.mojang.serialization.MapCodec;

public class dor extends dlc {
   public static final MapCodec<dor> a = b(dor::new);

   @Override
   public MapCodec<dor> a() {
      return a;
   }

   public dor(dur.d $$0) {
      super($$0);
   }

   @Override
   public void a(dej $$0, dus $$1, jf $$2, btr $$3, float $$4) {
      if ($$3.cc()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ak().l());
      }
   }

   @Override
   public void a(ddo $$0, btr $$1) {
      if ($$1.cc()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(btr $$0) {
      eyw $$1 = $$0.dv();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bun ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * $$2, $$1.f);
      }
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, btr $$3) {
      double $$4 = Math.abs($$3.dv().e);
      if ($$4 < 0.1 && !$$3.cb()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.h($$3.dv().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
