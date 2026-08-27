import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dck {
   private final Long2ObjectMap<List<aqu>> a = new Long2ObjectOpenHashMap();
   private final Map<aqu, dck.a> b = Maps.newHashMap();
   private final aqc c;

   public dck(aqc $$0) {
      this.c = $$0;
   }

   private List<aqu> a(dbh $$0) {
      return (List<aqu>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(dbh $$0, bsr $$1) {
      for (aqu $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new dck.a()).a($$1);
      }
   }

   public boolean a(bsr $$0, dbh $$1) {
      for (aqu $$2 : this.a($$1)) {
         dck.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bsr> a = new Object2IntOpenHashMap(bsr.values().length);

      public void a(bsr $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bsr $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
