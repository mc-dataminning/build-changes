import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class csp {
   private final Long2ObjectMap<List<amj>> a = new Long2ObjectOpenHashMap();
   private final Map<amj, csp.a> b = Maps.newHashMap();
   private final als c;

   public csp(als $$0) {
      this.c = $$0;
   }

   private List<amj> a(crm $$0) {
      return (List<amj>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(crm $$0, blo $$1) {
      for (amj $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new csp.a()).a($$1);
      }
   }

   public boolean a(blo $$0, crm $$1) {
      for (amj $$2 : this.a($$1)) {
         csp.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<blo> a = new Object2IntOpenHashMap(blo.values().length);

      public void a(blo $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(blo $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
