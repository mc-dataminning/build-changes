import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dca extends dfo {
   public static final MapCodec<dca> b = b(dca::new);
   private static final Map<ic, eml> e = Maps.immutableEnumMap(
      Map.of(
         ic.c,
         cwp.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         ic.d,
         cwp.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         ic.f,
         cwp.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         ic.e,
         cwp.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dca> a() {
      return b;
   }

   public dca(djf.d $$0) {
      super(ddq.b.h, $$0);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return e.get($$0.c(d));
   }
}
