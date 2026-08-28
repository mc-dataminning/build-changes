import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dhr {
   private final Long2ObjectMap<List<asi>> a = new Long2ObjectOpenHashMap();
   private final Map<asi, dhr.a> b = Maps.newHashMap();
   private final arm c;

   public dhr(arm $$0) {
      this.c = $$0;
   }

   private List<asi> a(dgn $$0) {
      return (List<asi>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.c($$0));
   }

   public void a(dgn $$0, bwi $$1) {
      for (asi $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new dhr.a()).a($$1);
      }
   }

   public boolean a(bwi $$0, dgn $$1) {
      for (asi $$2 : this.a($$1)) {
         dhr.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bwi> a = new Object2IntOpenHashMap(bwi.values().length);

      public void a(bwi $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bwi $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
