import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public record acl(Object2IntMap<awv<?>> b) implements zs<ach> {
   private static final zj<ww, Object2IntMap<awv<?>>> c = zh.a(Object2IntOpenHashMap::new, awv.a, zh.h);
   public static final zj<ww, acl> a = c.a(acl::new, acl::b);

   @Override
   public zu<acl> a() {
      return agw.f;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }
}
