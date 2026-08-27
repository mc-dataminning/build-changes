import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class ddz extends dhn {
   public static final MapCodec<ddz> b = b(ddz::new);
   private static final Map<ie, eol> e = Maps.immutableEnumMap(
      Map.of(
         ie.c,
         cyo.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         ie.d,
         cyo.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         ie.f,
         cyo.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         ie.e,
         cyo.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<ddz> a() {
      return b;
   }

   public ddz(dle.d $$0) {
      super(dfp.b.h, $$0);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return e.get($$0.c(d));
   }
}
