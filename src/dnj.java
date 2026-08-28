import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dnj extends dqz {
   public static final MapCodec<dnj> b = b(dnj::new);
   private static final Map<jl, fab> e = Maps.immutableEnumMap(
      Map.of(
         jl.c,
         dhy.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         jl.d,
         dhy.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         jl.f,
         dhy.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         jl.e,
         dhy.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dnj> a() {
      return b;
   }

   public dnj(dvc.d $$0) {
      super(dpa.b.h, $$0);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return e.get($$0.c(d));
   }
}
