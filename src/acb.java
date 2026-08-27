import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public record acb(Object2IntMap<avw<?>> b) implements zl<abw> {
   private static final zc<wp, Object2IntMap<avw<?>>> c = za.a(Object2IntOpenHashMap::new, avw.a, za.g);
   public static final zc<wp, acb> a = c.a(acb::new, acb::b);

   @Override
   public zn<acb> a() {
      return agj.g;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }
}
