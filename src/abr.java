import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public record abr(Object2IntMap<avo<?>> b) implements zb<abn> {
   private static final ys<wf, Object2IntMap<avo<?>>> c = yq.a(Object2IntOpenHashMap::new, avo.a, yq.g);
   public static final ys<wf, abr> a = c.a(abr::new, abr::b);

   @Override
   public zd<abr> a() {
      return afz.f;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }
}
