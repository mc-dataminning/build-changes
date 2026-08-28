import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dpv extends dtl {
   public static final MapCodec<dpv> b = b(dpv::new);
   private static final Map<jn, fcr> e = fco.c(dke.b(10.0, 8.0, 8.0, 16.0));

   @Override
   public MapCodec<dpv> a() {
      return b;
   }

   public dpv(dxp.d $$0) {
      super(drm.b.h, $$0);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return e.get($$0.c(d));
   }
}
