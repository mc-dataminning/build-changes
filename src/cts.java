import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class cts {
   private final Long2ObjectMap<List<ana>> a = new Long2ObjectOpenHashMap();
   private final Map<ana, cts.a> b = Maps.newHashMap();
   private final amj c;

   public cts(amj $$0) {
      this.c = $$0;
   }

   private List<ana> a(csp $$0) {
      return (List<ana>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(csp $$0, bmi $$1) {
      for (ana $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new cts.a()).a($$1);
      }
   }

   public boolean a(bmi $$0, csp $$1) {
      for (ana $$2 : this.a($$1)) {
         cts.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bmi> a = new Object2IntOpenHashMap(bmi.values().length);

      public void a(bmi $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bmi $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
