import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class djk extends dmz {
   public static final MapCodec<djk> b = b(djk::new);
   private static final Map<it, evd> e = Maps.immutableEnumMap(
      Map.of(
         it.c,
         ddy.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         it.d,
         ddy.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         it.f,
         ddy.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         it.e,
         ddy.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<djk> a() {
      return b;
   }

   public djk(dra.d $$0) {
      super(dla.b.h, $$0);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return e.get($$0.c(d));
   }
}
