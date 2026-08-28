import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public record aby(Object2IntMap<avw<?>> b) implements zg<abu> {
   private static final yx<wk, Object2IntMap<avw<?>>> c = yv.a(Object2IntOpenHashMap::new, avw.a, yv.g);
   public static final yx<wk, aby> a = c.a(aby::new, aby::b);

   @Override
   public zi<aby> a() {
      return agg.f;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }
}
