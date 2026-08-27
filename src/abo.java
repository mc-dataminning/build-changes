import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public record abo(Object2IntMap<avg<?>> b) implements yz<abk> {
   private static final yq<wd, Object2IntMap<avg<?>>> c = yo.a(Object2IntOpenHashMap::new, avg.a, yo.f);
   public static final yq<wd, abo> a = c.a(abo::new, abo::b);

   @Override
   public zb<abo> a() {
      return afv.f;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }
}
