import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public record abq(Object2IntMap<avj<?>> b) implements zb<abm> {
   private static final ys<wf, Object2IntMap<avj<?>>> c = yq.a(Object2IntOpenHashMap::new, avj.a, yq.f);
   public static final ys<wf, abq> a = c.a(abq::new, abq::b);

   @Override
   public zd<abq> a() {
      return afx.f;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }
}
