import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dkg extends dnv {
   public static final MapCodec<dkg> b = b(dkg::new);
   private static final Map<je, ewf> e = Maps.immutableEnumMap(
      Map.of(
         je.c,
         deu.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         je.d,
         deu.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         je.f,
         deu.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         je.e,
         deu.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dkg> a() {
      return b;
   }

   public dkg(drw.d $$0) {
      super(dlw.b.h, $$0);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return e.get($$0.c(d));
   }
}
