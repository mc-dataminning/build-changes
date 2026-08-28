import com.mojang.serialization.MapCodec;

public class dub extends dkl {
   public static final MapCodec<dub> a = b(dub::new);

   @Override
   public MapCodec<dub> a() {
      return a;
   }

   public dub(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
      fbx $$4 = new fbx(0.25, 0.05F, 0.25);
      if ($$3 instanceof bwf $$5 && $$5.b(buq.K)) {
         $$4 = new fbx(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
