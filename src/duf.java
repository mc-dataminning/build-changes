import com.mojang.serialization.MapCodec;

public class duf extends dql {
   public static final MapCodec<duf> a = b(duf::new);

   @Override
   public MapCodec<duf> a() {
      return a;
   }

   public duf(eas.d $$0) {
      super($$0);
   }

   @Override
   public void a(djm $$0, eat $$1, iv $$2, bwi $$3, double $$4) {
      if (!$$3.cd()) {
         $$3.a($$4, 0.0F, $$0.al().l());
      }
   }

   @Override
   public void a(diq $$0, bwi $$1) {
      if ($$1.cd()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bwi $$0) {
      ffc $$1 = $$0.dx();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bxj ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * $$2, $$1.f);
      }
   }

   @Override
   public void a(djm $$0, iv $$1, eat $$2, bwi $$3) {
      double $$4 = Math.abs($$3.dx().e);
      if ($$4 < 0.1 && !$$3.cc()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.i($$3.dx().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
