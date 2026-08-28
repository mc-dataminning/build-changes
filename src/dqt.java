import com.mojang.serialization.MapCodec;

public class dqt extends dnb {
   public static final MapCodec<dqt> a = b(dqt::new);

   @Override
   public MapCodec<dqt> a() {
      return a;
   }

   public dqt(dwu.d $$0) {
      super($$0);
   }

   @Override
   public void a(dgg $$0, dwv $$1, ji $$2, buj $$3, float $$4) {
      if (!$$3.cf()) {
         $$3.a($$4, 0.0F, $$0.ak().l());
      }
   }

   @Override
   public void a(dfl $$0, buj $$1) {
      if ($$1.cf()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(buj $$0) {
      fay $$1 = $$0.dz();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bvf ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * $$2, $$1.f);
      }
   }

   @Override
   public void a(dgg $$0, ji $$1, dwv $$2, buj $$3) {
      double $$4 = Math.abs($$3.dz().e);
      if ($$4 < 0.1 && !$$3.ce()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.h($$3.dz().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
