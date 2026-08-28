import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dgr {
   private final Long2ObjectMap<List<are>> a = new Long2ObjectOpenHashMap();
   private final Map<are, dgr.a> b = Maps.newHashMap();
   private final aqi c;

   public dgr(aqi $$0) {
      this.c = $$0;
   }

   private List<are> a(dfn $$0) {
      return (List<are>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.c($$0));
   }

   public void a(dfn $$0, bvj $$1) {
      for (are $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new dgr.a()).a($$1);
      }
   }

   public boolean a(bvj $$0, dfn $$1) {
      for (are $$2 : this.a($$1)) {
         dgr.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bvj> a = new Object2IntOpenHashMap(bvj.values().length);

      public void a(bvj $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bvj $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
