import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dae extends ddq {
   public static final MapCodec<dae> b = b(dae::new);
   private static final Map<hx, ekb> e = Maps.immutableEnumMap(
      Map.of(
         hx.c,
         cut.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         hx.d,
         cut.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         hx.f,
         cut.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         hx.e,
         cut.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dae> a() {
      return b;
   }

   public dae(dgv.d $$0) {
      super(dbu.b.h, $$0);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return e.get($$0.c(d));
   }
}
