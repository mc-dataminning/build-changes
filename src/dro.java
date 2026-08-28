import com.mojang.serialization.MapCodec;

public class dro extends dnw {
   public static final MapCodec<dro> a = b(dro::new);

   @Override
   public MapCodec<dro> a() {
      return a;
   }

   public dro(dxp.d $$0) {
      super($$0);
   }

   @Override
   public void a(dgz $$0, dxq $$1, ji $$2, bva $$3, float $$4) {
      if (!$$3.ce()) {
         $$3.a($$4, 0.0F, $$0.al().l());
      }
   }

   @Override
   public void a(dgf $$0, bva $$1) {
      if ($$1.ce()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bva $$0) {
      fbx $$1 = $$0.dx();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bvy ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * $$2, $$1.f);
      }
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, bva $$3) {
      double $$4 = Math.abs($$3.dx().e);
      if ($$4 < 0.1 && !$$3.cd()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.i($$3.dx().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
