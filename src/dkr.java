import com.mojang.serialization.MapCodec;

public class dkr extends dfm {
   public static final MapCodec<dkr> c = b(dkr::new);
   public static final est e = dby.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dkr> a() {
      return c;
   }

   public dkr(doy.d $$0) {
      super($$0, ih.b, e, false);
   }

   @Override
   protected dfn c() {
      return (dfn)dca.oB;
   }
}
