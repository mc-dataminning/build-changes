import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dpb extends dsr {
   public static final MapCodec<dpb> b = b(dpb::new);
   private static final Map<jn, fbt> e = Maps.immutableEnumMap(
      Map.of(
         jn.c,
         djl.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         jn.d,
         djl.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         jn.f,
         djl.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         jn.e,
         djl.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dpb> a() {
      return b;
   }

   public dpb(dwv.d $$0) {
      super(dqs.b.h, $$0);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return e.get($$0.c(d));
   }
}
