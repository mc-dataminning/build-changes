import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dcn {
   private final Long2ObjectMap<List<aql>> a = new Long2ObjectOpenHashMap();
   private final Map<aql, dcn.a> b = Maps.newHashMap();
   private final apt c;

   public dcn(apt $$0) {
      this.c = $$0;
   }

   private List<aql> a(dbk $$0) {
      return (List<aql>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(dbk $$0, btb $$1) {
      for (aql $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new dcn.a()).a($$1);
      }
   }

   public boolean a(btb $$0, dbk $$1) {
      for (aql $$2 : this.a($$1)) {
         dcn.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<btb> a = new Object2IntOpenHashMap(btb.values().length);

      public void a(btb $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(btb $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
