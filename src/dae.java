import com.mojang.serialization.MapCodec;

public class dae extends cwr {
   public static final MapCodec<dae> a = b(dae::new);

   @Override
   public MapCodec<dae> a() {
      return a;
   }

   public dae(dfc.d $$0) {
      super($$0);
   }

   @Override
   public void a(cqb $$0, dfd $$1, gw $$2, biw $$3, float $$4) {
      if ($$3.bT()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ag().k());
      }
   }

   @Override
   public void a(cph $$0, biw $$1) {
      if ($$1.bT()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(biw $$0) {
      ehh $$1 = $$0.do();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bjm ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, biw $$3) {
      double $$4 = Math.abs($$3.do().d);
      if ($$4 < 0.1 && !$$3.bS()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.f($$3.do().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
