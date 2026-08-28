import com.mojang.serialization.MapCodec;

public class dsv extends dli {
   public static final MapCodec<dsv> n = b(dsv::new);

   @Override
   public MapCodec<dsv> a() {
      return n;
   }

   public dsv(dxm.d $$0) {
      super(() -> dur.c, $$0);
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dwl($$0, $$1);
   }

   @Override
   protected axm<alz> c() {
      return axp.i.b(axp.ai);
   }

   @Override
   protected boolean f_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return bae.a(duw.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return $$3 == jm.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
