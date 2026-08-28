import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dkm extends dob {
   public static final MapCodec<dkm> b = b(dkm::new);
   private static final Map<je, ewl> e = Maps.immutableEnumMap(
      Map.of(
         je.c,
         dfa.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         je.d,
         dfa.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         je.f,
         dfa.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         je.e,
         dfa.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dkm> a() {
      return b;
   }

   public dkm(dsc.d $$0) {
      super(dmc.b.h, $$0);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return e.get($$0.c(d));
   }
}
