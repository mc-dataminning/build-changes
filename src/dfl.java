import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dfl extends dja {
   public static final MapCodec<dfl> b = b(dfl::new);
   private static final Map<ih, eqk> e = Maps.immutableEnumMap(
      Map.of(
         ih.c,
         daa.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         ih.d,
         daa.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         ih.f,
         daa.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         ih.e,
         daa.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dfl> a() {
      return b;
   }

   public dfl(dmy.d $$0) {
      super(dhb.b.h, $$0);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return e.get($$0.c(d));
   }
}
