import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dkr extends dog {
   public static final MapCodec<dkr> b = b(dkr::new);
   private static final Map<jf, ews> e = Maps.immutableEnumMap(
      Map.of(
         jf.c,
         dff.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         jf.d,
         dff.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         jf.f,
         dff.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         jf.e,
         dff.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dkr> a() {
      return b;
   }

   public dkr(dsg.d $$0) {
      super(dmh.b.h, $$0);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return e.get($$0.c(d));
   }
}
