import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public record aci(Object2IntMap<axf<?>> b) implements zo<acf> {
   private static final ze<wp, Object2IntMap<axf<?>>> c = zc.a(Object2IntOpenHashMap::new, axf.a, zc.h);
   public static final ze<wp, aci> a = c.a(aci::new, aci::b);

   @Override
   public zq<aci> a() {
      return agy.e;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }
}
