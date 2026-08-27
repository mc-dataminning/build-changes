import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dbk extends dey {
   public static final MapCodec<dbk> b = b(dbk::new);
   private static final Map<ia, elu> e = Maps.immutableEnumMap(
      Map.of(
         ia.c,
         cvz.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         ia.d,
         cvz.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         ia.f,
         cvz.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         ia.e,
         cvz.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dbk> a() {
      return b;
   }

   public dbk(dio.d $$0) {
      super(dda.b.h, $$0);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return e.get($$0.c(d));
   }
}
