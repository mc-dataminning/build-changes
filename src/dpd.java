import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dpd extends dst {
   public static final MapCodec<dpd> b = b(dpd::new);
   private static final Map<jn, fbv> e = Maps.immutableEnumMap(
      Map.of(
         jn.c,
         djn.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         jn.d,
         djn.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         jn.f,
         djn.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         jn.e,
         djn.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dpd> a() {
      return b;
   }

   public dpd(dwx.d $$0) {
      super(dqu.b.h, $$0);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return e.get($$0.c(d));
   }
}
