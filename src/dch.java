import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dch {
   private final Long2ObjectMap<List<arf>> a = new Long2ObjectOpenHashMap();
   private final Map<arf, dch.a> b = Maps.newHashMap();
   private final aqn c;

   public dch(aqn $$0) {
      this.c = $$0;
   }

   private List<arf> a(dbe $$0) {
      return (List<arf>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(dbe $$0, btr $$1) {
      for (arf $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new dch.a()).a($$1);
      }
   }

   public boolean a(btr $$0, dbe $$1) {
      for (arf $$2 : this.a($$1)) {
         dch.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<btr> a = new Object2IntOpenHashMap(btr.values().length);

      public void a(btr $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(btr $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
