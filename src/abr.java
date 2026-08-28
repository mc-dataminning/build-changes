import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public record abr(Object2IntMap<avm<?>> b) implements zb<abn> {
   private static final ys<wf, Object2IntMap<avm<?>>> c = yq.a(Object2IntOpenHashMap::new, avm.a, yq.g);
   public static final ys<wf, abr> a = c.a(abr::new, abr::b);

   @Override
   public zd<abr> a() {
      return afz.f;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }
}
