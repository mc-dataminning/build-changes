import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dfp {
   private final Long2ObjectMap<List<arr>> a = new Long2ObjectOpenHashMap();
   private final Map<arr, dfp.a> b = Maps.newHashMap();
   private final aqw c;

   public dfp(aqw $$0) {
      this.c = $$0;
   }

   private List<arr> a(del $$0) {
      return (List<arr>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.c($$0));
   }

   public void a(del $$0, bvh $$1) {
      for (arr $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new dfp.a()).a($$1);
      }
   }

   public boolean a(bvh $$0, del $$1) {
      for (arr $$2 : this.a($$1)) {
         dfp.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bvh> a = new Object2IntOpenHashMap(bvh.values().length);

      public void a(bvh $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bvh $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
