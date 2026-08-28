import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dcd {
   private final Long2ObjectMap<List<arc>> a = new Long2ObjectOpenHashMap();
   private final Map<arc, dcd.a> b = Maps.newHashMap();
   private final aqk c;

   public dcd(aqk $$0) {
      this.c = $$0;
   }

   private List<arc> a(dba $$0) {
      return (List<arc>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(dba $$0, btn $$1) {
      for (arc $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new dcd.a()).a($$1);
      }
   }

   public boolean a(btn $$0, dba $$1) {
      for (arc $$2 : this.a($$1)) {
         dcd.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<btn> a = new Object2IntOpenHashMap(btn.values().length);

      public void a(btn $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(btn $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
