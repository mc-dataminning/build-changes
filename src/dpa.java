import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dpa extends dsq {
   public static final MapCodec<dpa> b = b(dpa::new);
   private static final Map<jn, fbs> e = Maps.immutableEnumMap(
      Map.of(
         jn.c,
         djk.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         jn.d,
         djk.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         jn.f,
         djk.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         jn.e,
         djk.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dpa> a() {
      return b;
   }

   public dpa(dwu.d $$0) {
      super(dqr.b.h, $$0);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return e.get($$0.c(d));
   }
}
