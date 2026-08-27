import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class diq extends dmf {
   public static final MapCodec<diq> b = b(diq::new);
   private static final Map<is, eui> e = Maps.immutableEnumMap(
      Map.of(
         is.c,
         dde.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         is.d,
         dde.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         is.f,
         dde.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         is.e,
         dde.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<diq> a() {
      return b;
   }

   public diq(dqg.d $$0) {
      super(dkg.b.h, $$0);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return e.get($$0.c(d));
   }
}
