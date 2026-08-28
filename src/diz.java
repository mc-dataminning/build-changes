import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class diz {
   private final Long2ObjectMap<List<arp>> a = new Long2ObjectOpenHashMap();
   private final Map<arp, diz.a> b = Maps.newHashMap();
   private final aqs c;

   public diz(aqs $$0) {
      this.c = $$0;
   }

   private List<arp> a(dhw $$0) {
      return (List<arp>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.c($$0));
   }

   public void a(dhw $$0, bxc $$1) {
      for (arp $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new diz.a()).a($$1);
      }
   }

   public boolean a(bxc $$0, dhw $$1) {
      for (arp $$2 : this.a($$1)) {
         diz.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bxc> a = new Object2IntOpenHashMap(bxc.values().length);

      public void a(bxc $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bxc $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
