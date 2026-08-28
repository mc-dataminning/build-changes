import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dkn extends doc {
   public static final MapCodec<dkn> b = b(dkn::new);
   private static final Map<je, ewm> e = Maps.immutableEnumMap(
      Map.of(
         je.c,
         dfb.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         je.d,
         dfb.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         je.f,
         dfb.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         je.e,
         dfb.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dkn> a() {
      return b;
   }

   public dkn(dsd.d $$0) {
      super(dmd.b.h, $$0);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return e.get($$0.c(d));
   }
}
