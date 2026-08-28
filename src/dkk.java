import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dkk extends dnz {
   public static final MapCodec<dkk> b = b(dkk::new);
   private static final Map<je, ewj> e = Maps.immutableEnumMap(
      Map.of(
         je.c,
         dey.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         je.d,
         dey.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         je.f,
         dey.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         je.e,
         dey.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dkk> a() {
      return b;
   }

   public dkk(dsa.d $$0) {
      super(dma.b.h, $$0);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return e.get($$0.c(d));
   }
}
