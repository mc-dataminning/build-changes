import com.mojang.serialization.MapCodec;

public class dlx extends dgt {
   public static final MapCodec<dlx> c = b(dlx::new);
   public static final eui g = dde.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dlx> a() {
      return c;
   }

   public dlx(dqg.d $$0) {
      super($$0, is.b, g, false, 0.1);
   }

   @Override
   protected int a(ayg $$0) {
      return dik.a($$0);
   }

   @Override
   protected dde b() {
      return ddg.oC;
   }

   @Override
   protected boolean g(dqh $$0) {
      return dik.a($$0);
   }
}
