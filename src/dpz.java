import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dpz extends dtp {
   public static final MapCodec<dpz> b = b(dpz::new);
   private static final Map<jm, fcr> e = Maps.immutableEnumMap(
      Map.of(
         jm.c,
         dkl.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         jm.d,
         dkl.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         jm.f,
         dkl.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         jm.e,
         dkl.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dpz> a() {
      return b;
   }

   public dpz(dxt.d $$0) {
      super(drq.b.h, $$0);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return e.get($$0.c(d));
   }
}
