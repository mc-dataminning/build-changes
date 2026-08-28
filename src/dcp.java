import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dcp {
   private final Long2ObjectMap<List<aqn>> a = new Long2ObjectOpenHashMap();
   private final Map<aqn, dcp.a> b = Maps.newHashMap();
   private final apt c;

   public dcp(apt $$0) {
      this.c = $$0;
   }

   private List<aqn> a(dbm $$0) {
      return (List<aqn>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.c($$0));
   }

   public void a(dbm $$0, bte $$1) {
      for (aqn $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new dcp.a()).a($$1);
      }
   }

   public boolean a(bte $$0, dbm $$1) {
      for (aqn $$2 : this.a($$1)) {
         dcp.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bte> a = new Object2IntOpenHashMap(bte.values().length);

      public void a(bte $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bte $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
