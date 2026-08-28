import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dmv extends dql {
   public static final MapCodec<dmv> b = b(dmv::new);
   private static final Map<jj, ezm> e = Maps.immutableEnumMap(
      Map.of(
         jj.c,
         dhj.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         jj.d,
         dhj.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         jj.f,
         dhj.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         jj.e,
         dhj.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<dmv> a() {
      return b;
   }

   public dmv(dun.d $$0) {
      super(dom.b.h, $$0);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return e.get($$0.c(d));
   }
}
