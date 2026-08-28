import com.mojang.serialization.MapCodec;

public class dtv extends dkd {
   public static final MapCodec<dtv> a = b(dtv::new);

   @Override
   public MapCodec<dtv> a() {
      return a;
   }

   public dtv(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, bvb $$3) {
      fbr $$4 = new fbr(0.25, 0.05F, 0.25);
      if ($$3 instanceof bvx $$5 && $$5.b(bui.K)) {
         $$4 = new fbr(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
