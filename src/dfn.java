import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dfn extends djc {
   public static final MapCodec<dfn> b = b(dfn::new);
   private static final Map<ih, eqm> e = Maps.immutableEnumMap(
      Map.of(
         ih.c,
         dac.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         ih.d,
         dac.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         ih.f,
         dac.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         ih.e,
         dac.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dfn> a() {
      return b;
   }

   public dfn(dna.d $$0) {
      super(dhd.b.h, $$0);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return e.get($$0.c(d));
   }
}
