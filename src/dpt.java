import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dpt extends dtj {
   public static final MapCodec<dpt> b = b(dpt::new);
   private static final Map<jm, fcl> e = Maps.immutableEnumMap(
      Map.of(
         jm.c,
         dkd.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         jm.d,
         dkd.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         jm.f,
         dkd.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         jm.e,
         dkd.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dpt> a() {
      return b;
   }

   public dpt(dxn.d $$0) {
      super(drk.b.h, $$0);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return e.get($$0.c(d));
   }
}
