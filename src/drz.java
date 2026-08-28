import com.mojang.serialization.MapCodec;

public class drz extends djy {
   public static final MapCodec<drz> c = b(drz::new);

   @Override
   public MapCodec<drz> a() {
      return c;
   }

   public drz(dxt.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return this.a($$0, $$1, $$3) ? this.m() : dkn.a.m();
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(dxu $$0) {
      return $$0.a(axu.aV);
   }

   @Override
   protected boolean g(dxu $$0) {
      return true;
   }
}
