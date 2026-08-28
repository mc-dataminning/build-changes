import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dpc extends dss {
   public static final MapCodec<dpc> b = b(dpc::new);
   private static final Map<jn, fbu> e = Maps.immutableEnumMap(
      Map.of(
         jn.c,
         djm.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         jn.d,
         djm.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         jn.f,
         djm.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         jn.e,
         djm.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dpc> a() {
      return b;
   }

   public dpc(dww.d $$0) {
      super(dqt.b.h, $$0);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return e.get($$0.c(d));
   }
}
