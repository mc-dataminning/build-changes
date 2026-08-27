import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dbu extends dfi {
   public static final MapCodec<dbu> b = b(dbu::new);
   private static final Map<ic, emf> e = Maps.immutableEnumMap(
      Map.of(
         ic.c,
         cwj.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         ic.d,
         cwj.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         ic.f,
         cwj.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         ic.e,
         cwj.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dbu> a() {
      return b;
   }

   public dbu(diz.d $$0) {
      super(ddk.b.h, $$0);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return e.get($$0.c(d));
   }
}
