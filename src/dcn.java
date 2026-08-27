import com.mojang.serialization.MapCodec;

public class dcn extends dco {
   public static final MapCodec<dcn> a = b(dcn::new);
   protected static final float b = 6.0F;
   protected static final eui c = dde.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dcn> a() {
      return a;
   }

   protected dcn(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return c;
   }
}
