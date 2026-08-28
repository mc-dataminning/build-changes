import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dnu extends drk {
   public static final MapCodec<dnu> b = b(dnu::new);
   private static final Map<jm, fal> e = Maps.immutableEnumMap(
      Map.of(
         jm.c,
         dij.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         jm.d,
         dij.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         jm.f,
         dij.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         jm.e,
         dij.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dnu> a() {
      return b;
   }

   public dnu(dvn.d $$0) {
      super(dpl.b.h, $$0);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return e.get($$0.c(d));
   }
}
