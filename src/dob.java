import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dob extends drr {
   public static final MapCodec<dob> b = b(dob::new);
   private static final Map<jm, fas> e = Maps.immutableEnumMap(
      Map.of(
         jm.c,
         diq.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         jm.d,
         diq.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         jm.f,
         diq.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         jm.e,
         diq.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dob> a() {
      return b;
   }

   public dob(dvu.d $$0) {
      super(dps.b.h, $$0);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return e.get($$0.c(d));
   }
}
