import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class czk extends dcw {
   public static final MapCodec<czk> b = b(czk::new);
   private static final Map<hx, eiy> e = Maps.immutableEnumMap(
      Map.of(
         hx.c,
         cua.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         hx.d,
         cua.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         hx.f,
         cua.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         hx.e,
         cua.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<czk> a() {
      return b;
   }

   public czk(dga.d $$0) {
      super(dba.b.h, $$0);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return e.get($$0.c(d));
   }
}
