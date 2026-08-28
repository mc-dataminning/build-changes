import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dqa extends dtq {
   public static final MapCodec<dqa> b = b(dqa::new);
   private static final Map<jm, fcs> e = Maps.immutableEnumMap(
      Map.of(
         jm.c,
         dkm.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         jm.d,
         dkm.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         jm.f,
         dkm.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         jm.e,
         dkm.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dqa> a() {
      return b;
   }

   public dqa(dxu.d $$0) {
      super(drr.b.h, $$0);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return e.get($$0.c(d));
   }
}
