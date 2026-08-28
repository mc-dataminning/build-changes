import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dkt {
   private final Long2ObjectMap<List<asc>> a = new Long2ObjectOpenHashMap();
   private final Map<asc, dkt.a> b = Maps.newHashMap();
   private final arf c;

   public dkt(arf $$0) {
      this.c = $$0;
   }

   private List<asc> a(djo $$0) {
      return (List<asc>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.c($$0));
   }

   public void a(djo $$0, byi $$1) {
      for (asc $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new dkt.a()).a($$1);
      }
   }

   public boolean a(byi $$0, djo $$1) {
      for (asc $$2 : this.a($$1)) {
         dkt.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<byi> a = new Object2IntOpenHashMap(byi.values().length);

      public void a(byi $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(byi $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
