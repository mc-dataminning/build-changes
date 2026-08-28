import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dli extends doy {
   public static final MapCodec<dli> b = b(dli::new);
   private static final Map<ji, exp> e = Maps.immutableEnumMap(
      Map.of(
         ji.c,
         dfw.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         ji.d,
         dfw.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         ji.f,
         dfw.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         ji.e,
         dfw.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dli> a() {
      return b;
   }

   public dli(dsz.d $$0) {
      super(dmz.b.h, $$0);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return e.get($$0.c(d));
   }
}
