import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public record aak(Object2IntMap<atr<?>> b) implements xx<aag> {
   private static final xo<vb, Object2IntMap<atr<?>>> c = xm.a(Object2IntOpenHashMap::new, atr.a, xm.d);
   public static final xo<vb, aak> a = c.a(aak::new, aak::b);

   @Override
   public xz<aak> a() {
      return aeq.f;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }
}
