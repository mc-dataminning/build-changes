import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class ctz {
   private final Long2ObjectMap<List<ane>> a = new Long2ObjectOpenHashMap();
   private final Map<ane, ctz.a> b = Maps.newHashMap();
   private final amn c;

   public ctz(amn $$0) {
      this.c = $$0;
   }

   private List<ane> a(csw $$0) {
      return (List<ane>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(csw $$0, bmo $$1) {
      for (ane $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new ctz.a()).a($$1);
      }
   }

   public boolean a(bmo $$0, csw $$1) {
      for (ane $$2 : this.a($$1)) {
         ctz.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bmo> a = new Object2IntOpenHashMap(bmo.values().length);

      public void a(bmo $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bmo $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
