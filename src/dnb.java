import com.mojang.serialization.MapCodec;

public class dnb extends dwd implements dmu {
   public static final MapCodec<dnb> a = b(dnb::new);
   private static final ffw b = dmr.b(16.0, 0.0, 13.0);

   @Override
   public MapCodec<dnb> a() {
      return a;
   }

   protected dnb(eas.d $$0) {
      super($$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return b;
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return dmu.a_($$0, $$1, $$2);
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      dmu.a((djm)$$0, $$2, $$3).ifPresent($$1x -> $$0.b($$1x, this.m()));
   }
}
