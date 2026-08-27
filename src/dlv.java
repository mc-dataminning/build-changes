import com.mojang.serialization.MapCodec;

public class dlv extends dfv {
   public static final MapCodec<dlv> c = b(dlv::new);
   public static final etc e = dch.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dlv> a() {
      return c;
   }

   public dlv(dph.d $$0) {
      super($$0, ij.a, e, false);
   }

   @Override
   protected dfw c() {
      return (dfw)dcj.oz;
   }
}
