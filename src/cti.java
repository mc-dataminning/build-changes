import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class cti {
   private final Long2ObjectMap<List<amq>> a = new Long2ObjectOpenHashMap();
   private final Map<amq, cti.a> b = Maps.newHashMap();
   private final alz c;

   public cti(alz $$0) {
      this.c = $$0;
   }

   private List<amq> a(csf $$0) {
      return (List<amq>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(csf $$0, bly $$1) {
      for (amq $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new cti.a()).a($$1);
      }
   }

   public boolean a(bly $$0, csf $$1) {
      for (amq $$2 : this.a($$1)) {
         cti.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bly> a = new Object2IntOpenHashMap(bly.values().length);

      public void a(bly $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bly $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
