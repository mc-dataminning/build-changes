import com.mojang.serialization.MapCodec;

public class dkf extends djn {
   public static final MapCodec<dkf> a = b(dkf::new);
   protected static final fbv b = djn.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dkf> a() {
      return a;
   }

   public dkf(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return b;
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return !$$0.a($$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return !$$1.u($$2.e());
   }
}
