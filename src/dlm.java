import com.mojang.serialization.MapCodec;

public class dlm extends dfm {
   public static final MapCodec<dlm> c = b(dlm::new);
   public static final est e = dby.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dlm> a() {
      return c;
   }

   public dlm(doy.d $$0) {
      super($$0, ih.a, e, false);
   }

   @Override
   protected dfn c() {
      return (dfn)dca.oz;
   }
}
