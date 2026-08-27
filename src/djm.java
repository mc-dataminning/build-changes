import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class djm extends dnb {
   public static final MapCodec<djm> b = b(djm::new);
   private static final Map<it, evf> e = Maps.immutableEnumMap(
      Map.of(
         it.c,
         dea.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         it.d,
         dea.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         it.f,
         dea.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         it.e,
         dea.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<djm> a() {
      return b;
   }

   public djm(drc.d $$0) {
      super(dlc.b.h, $$0);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return e.get($$0.c(d));
   }
}
