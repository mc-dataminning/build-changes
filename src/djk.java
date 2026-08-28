import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class djk {
   private final Long2ObjectMap<List<arr>> a = new Long2ObjectOpenHashMap();
   private final Map<arr, djk.a> b = Maps.newHashMap();
   private final aqu c;

   public djk(aqu $$0) {
      this.c = $$0;
   }

   private List<arr> a(dih $$0) {
      return (List<arr>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.c($$0));
   }

   public void a(dih $$0, bxh $$1) {
      for (arr $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new djk.a()).a($$1);
      }
   }

   public boolean a(bxh $$0, dih $$1) {
      for (arr $$2 : this.a($$1)) {
         djk.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bxh> a = new Object2IntOpenHashMap(bxh.values().length);

      public void a(bxh $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bxh $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
