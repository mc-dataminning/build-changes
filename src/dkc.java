import com.mojang.serialization.MapCodec;

public abstract class dkc extends dkm {
   protected static final int a = 2;
   protected static final fcs b = dkm.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected dkc(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkc> a();

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return b;
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      return $$4 == jm.a && !this.a($$0, $$1, $$3) ? dko.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      return a($$1, $$2.e(), jm.b);
   }
}
