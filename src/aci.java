import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public record aci(Object2IntMap<awd<?>> b) implements zs<ace> {
   private static final zj<ww, Object2IntMap<awd<?>>> c = zh.a(Object2IntOpenHashMap::new, awd.a, zh.g);
   public static final zj<ww, aci> a = c.a(aci::new, aci::b);

   @Override
   public zu<aci> a() {
      return agq.f;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }
}
