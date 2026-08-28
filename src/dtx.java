import com.mojang.serialization.MapCodec;

public class dtx extends dke {
   public static final MapCodec<dtx> a = b(dtx::new);

   @Override
   public MapCodec<dtx> a() {
      return a;
   }

   public dtx(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      fbx $$4 = new fbx(0.25, 0.05F, 0.25);
      if ($$3 instanceof bvy $$5 && $$5.b(bug.K)) {
         $$4 = new fbx(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
