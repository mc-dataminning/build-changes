import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dmh extends dpx {
   public static final MapCodec<dmh> b = b(dmh::new);
   private static final Map<jj, eyx> e = Maps.immutableEnumMap(
      Map.of(
         jj.c,
         dgv.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         jj.d,
         dgv.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         jj.f,
         dgv.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         jj.e,
         dgv.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dmh> a() {
      return b;
   }

   public dmh(dtz.d $$0) {
      super(dny.b.h, $$0);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return e.get($$0.c(d));
   }
}
