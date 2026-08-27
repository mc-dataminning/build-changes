import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class cxj {
   private final Long2ObjectMap<List<apg>> a = new Long2ObjectOpenHashMap();
   private final Map<apg, cxj.a> b = Maps.newHashMap();
   private final aop c;

   public cxj(aop $$0) {
      this.c = $$0;
   }

   private List<apg> a(cwg $$0) {
      return (List<apg>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(cwg $$0, bpr $$1) {
      for (apg $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new cxj.a()).a($$1);
      }
   }

   public boolean a(bpr $$0, cwg $$1) {
      for (apg $$2 : this.a($$1)) {
         cxj.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bpr> a = new Object2IntOpenHashMap(bpr.values().length);

      public void a(bpr $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bpr $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
