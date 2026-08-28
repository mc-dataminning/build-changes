import com.mojang.serialization.MapCodec;

public abstract class dkb extends dkl {
   protected static final int a = 2;
   protected static final fcr b = dkl.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected dkb(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkb> a();

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return b;
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return $$4 == jm.a && !this.a($$0, $$1, $$3) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      return a($$1, $$2.e(), jm.b);
   }
}
