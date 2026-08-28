import com.mojang.serialization.MapCodec;

public class dle extends dkm {
   public static final MapCodec<dle> a = b(dle::new);
   protected static final fcs b = dkm.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dle> a() {
      return a;
   }

   public dle(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return b;
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      return !$$0.a($$1, $$3) ? dko.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      return !$$1.u($$2.e());
   }
}
