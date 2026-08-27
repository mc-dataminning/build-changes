import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class cqf {
   private final Long2ObjectMap<List<aks>> a = new Long2ObjectOpenHashMap();
   private final Map<aks, cqf.a> b = Maps.newHashMap();
   private final akb c;

   public cqf(akb $$0) {
      this.c = $$0;
   }

   private List<aks> a(cpc $$0) {
      return (List<aks>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(cpc $$0, bjj $$1) {
      for (aks $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new cqf.a()).a($$1);
      }
   }

   public boolean a(bjj $$0, cpc $$1) {
      for (aks $$2 : this.a($$1)) {
         cqf.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bjj> a = new Object2IntOpenHashMap(bjj.values().length);

      public void a(bjj $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bjj $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
