import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public record acm(Object2IntMap<awh<?>> b) implements zw<aci> {
   private static final zn<xa, Object2IntMap<awh<?>>> c = zl.a(Object2IntOpenHashMap::new, awh.a, zl.g);
   public static final zn<xa, acm> a = c.a(acm::new, acm::b);

   @Override
   public zy<acm> a() {
      return agu.f;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }
}
