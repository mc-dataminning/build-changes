import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dku extends dot {
   public static final MapCodec<dku> b = b(dku::new);
   private static final Map<iw, exn> e = Maps.immutableEnumMap(
      Map.of(
         iw.c,
         dfc.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         iw.d,
         dfc.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         iw.f,
         dfc.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         iw.e,
         dfc.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dku> a() {
      return b;
   }

   public dku(dtb.d $$0) {
      super(dms.b.h, $$0);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return e.get($$0.c(d));
   }
}
