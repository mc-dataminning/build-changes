import com.mojang.serialization.MapCodec;

public class dtd extends dlq {
   public static final MapCodec<dtd> n = b(dtd::new);

   @Override
   public MapCodec<dtd> a() {
      return n;
   }

   public dtd(dxu.d $$0) {
      super(() -> duz.c, $$0);
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dwt($$0, $$1);
   }

   @Override
   protected axm<alz> c() {
      return axp.i.b(axp.ai);
   }

   @Override
   protected boolean f_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      return bae.a(dve.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      return $$3 == jm.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
