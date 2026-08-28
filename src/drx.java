import com.mojang.serialization.MapCodec;

public class drx extends dlx {
   public static final MapCodec<drx> c = b(drx::new);
   protected static final fal g = dij.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<drx> a() {
      return c;
   }

   public drx(dvn.d $$0) {
      super($$0, jm.a, g, false, 0.1);
   }

   @Override
   protected int a(azv $$0) {
      return dno.a($$0);
   }

   @Override
   protected dij b() {
      return dil.oA;
   }

   @Override
   protected boolean h(dvo $$0) {
      return dno.a($$0);
   }
}
