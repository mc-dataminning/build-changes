import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class deq extends dif {
   public static final MapCodec<deq> b = b(deq::new);
   private static final Map<ih, epo> e = Maps.immutableEnumMap(
      Map.of(
         ih.c,
         czf.a(3.0, 4.0, 8.0, 13.0, 12.0, 16.0),
         ih.d,
         czf.a(3.0, 4.0, 0.0, 13.0, 12.0, 8.0),
         ih.f,
         czf.a(0.0, 4.0, 3.0, 8.0, 12.0, 13.0),
         ih.e,
         czf.a(8.0, 4.0, 3.0, 16.0, 12.0, 13.0)
      )
   );

   @Override
   public MapCodec<deq> a() {
      return b;
   }

   public deq(dmd.d $$0) {
      super(dgg.b.h, $$0);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return e.get($$0.c(d));
   }
}
