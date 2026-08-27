import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class cql {
   private final Long2ObjectMap<List<aku>> a = new Long2ObjectOpenHashMap();
   private final Map<aku, cql.a> b = Maps.newHashMap();
   private final akd c;

   public cql(akd $$0) {
      this.c = $$0;
   }

   private List<aku> a(cpi $$0) {
      return (List<aku>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(cpi $$0, bjp $$1) {
      for (aku $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new cql.a()).a($$1);
      }
   }

   public boolean a(bjp $$0, cpi $$1) {
      for (aku $$2 : this.a($$1)) {
         cql.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bjp> a = new Object2IntOpenHashMap(bjp.values().length);

      public void a(bjp $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bjp $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
