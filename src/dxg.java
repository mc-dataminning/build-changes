import com.mojang.serialization.MapCodec;

public class dxg extends dnc {
   public static final MapCodec<dxg> a = b(dxg::new);

   @Override
   public MapCodec<dxg> a() {
      return a;
   }

   public dxg(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      ffq $$5 = new ffq(0.25, 0.05F, 0.25);
      if ($$3 instanceof bxu $$6 && $$6.b(bvz.K)) {
         $$5 = new ffq(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$5);
   }
}
