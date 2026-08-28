import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dku extends doj {
   public static final MapCodec<dku> b = b(dku::new);
   private static final Map<jf, exa> e = Maps.immutableEnumMap(
      Map.of(
         jf.c,
         dfi.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         jf.d,
         dfi.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         jf.f,
         dfi.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         jf.e,
         dfi.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dku> a() {
      return b;
   }

   public dku(dsk.d $$0) {
      super(dmk.b.h, $$0);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return e.get($$0.c(d));
   }
}
