import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dps extends dti {
   public static final MapCodec<dps> b = b(dps::new);
   private static final Map<jm, fcm> e = Maps.immutableEnumMap(
      Map.of(
         jm.c,
         dke.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         jm.d,
         dke.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         jm.f,
         dke.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         jm.e,
         dke.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dps> a() {
      return b;
   }

   public dps(dxm.d $$0) {
      super(drj.b.h, $$0);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return e.get($$0.c(d));
   }
}
