import com.mojang.serialization.MapCodec;

public class dma extends dfc implements dff {
   public static final MapCodec<dma> a = b(dma::new);

   @Override
   public MapCodec<dma> a() {
      return a;
   }

   public dma(dtb.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      $$0.b($$2.d(), dfe.ud.n());
   }

   @Override
   public ir a(ir $$0) {
      return $$0.d();
   }
}
