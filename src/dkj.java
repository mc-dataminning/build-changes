import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dkj extends dny {
   public static final MapCodec<dkj> b = b(dkj::new);
   private static final Map<je, ewi> e = Maps.immutableEnumMap(
      Map.of(
         je.c,
         dex.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         je.d,
         dex.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         je.f,
         dex.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         je.e,
         dex.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dkj> a() {
      return b;
   }

   public dkj(drz.d $$0) {
      super(dlz.b.h, $$0);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return e.get($$0.c(d));
   }
}
