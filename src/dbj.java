import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dbj {
   private final Long2ObjectMap<List<aqo>> a = new Long2ObjectOpenHashMap();
   private final Map<aqo, dbj.a> b = Maps.newHashMap();
   private final apw c;

   public dbj(apw $$0) {
      this.c = $$0;
   }

   private List<aqo> a(dag $$0) {
      return (List<aqo>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(dag $$0, bst $$1) {
      for (aqo $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new dbj.a()).a($$1);
      }
   }

   public boolean a(bst $$0, dag $$1) {
      for (aqo $$2 : this.a($$1)) {
         dbj.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bst> a = new Object2IntOpenHashMap(bst.values().length);

      public void a(bst $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bst $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
