import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dck {
   private final Long2ObjectMap<List<arg>> a = new Long2ObjectOpenHashMap();
   private final Map<arg, dck.a> b = Maps.newHashMap();
   private final aqo c;

   public dck(aqo $$0) {
      this.c = $$0;
   }

   private List<arg> a(dbh $$0) {
      return (List<arg>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(dbh $$0, btu $$1) {
      for (arg $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new dck.a()).a($$1);
      }
   }

   public boolean a(btu $$0, dbh $$1) {
      for (arg $$2 : this.a($$1)) {
         dck.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<btu> a = new Object2IntOpenHashMap(btu.values().length);

      public void a(btu $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(btu $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
