import com.mojang.serialization.MapCodec;

public class dpn extends dly {
   public static final MapCodec<dpn> a = b(dpn::new);

   @Override
   public MapCodec<dpn> a() {
      return a;
   }

   public dpn(dvn.d $$0) {
      super($$0);
   }

   @Override
   public void a(dff $$0, dvo $$1, jh $$2, bui $$3, float $$4) {
      if ($$3.ch()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ai().l());
      }
   }

   @Override
   public void a(dek $$0, bui $$1) {
      if ($$1.ch()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bui $$0) {
      ezr $$1 = $$0.dB();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bve ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * $$2, $$1.f);
      }
   }

   @Override
   public void a(dff $$0, jh $$1, dvo $$2, bui $$3) {
      double $$4 = Math.abs($$3.dB().e);
      if ($$4 < 0.1 && !$$3.cg()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.h($$3.dB().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
