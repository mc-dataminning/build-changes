import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class cwb {
   private final Long2ObjectMap<List<aox>> a = new Long2ObjectOpenHashMap();
   private final Map<aox, cwb.a> b = Maps.newHashMap();
   private final aog c;

   public cwb(aog $$0) {
      this.c = $$0;
   }

   private List<aox> a(cuy $$0) {
      return (List<aox>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(cuy $$0, bol $$1) {
      for (aox $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new cwb.a()).a($$1);
      }
   }

   public boolean a(bol $$0, cuy $$1) {
      for (aox $$2 : this.a($$1)) {
         cwb.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bol> a = new Object2IntOpenHashMap(bol.values().length);

      public void a(bol $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bol $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
