import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dkh {
   private final Long2ObjectMap<List<art>> a = new Long2ObjectOpenHashMap();
   private final Map<art, dkh.a> b = Maps.newHashMap();
   private final aqw c;

   public dkh(aqw $$0) {
      this.c = $$0;
   }

   private List<art> a(djc $$0) {
      return (List<art>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.c($$0));
   }

   public void a(djc $$0, bxx $$1) {
      for (art $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new dkh.a()).a($$1);
      }
   }

   public boolean a(bxx $$0, djc $$1) {
      for (art $$2 : this.a($$1)) {
         dkh.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bxx> a = new Object2IntOpenHashMap(bxx.values().length);

      public void a(bxx $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bxx $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
