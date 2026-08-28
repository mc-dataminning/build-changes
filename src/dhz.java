import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dhz {
   private final Long2ObjectMap<List<aro>> a = new Long2ObjectOpenHashMap();
   private final Map<aro, dhz.a> b = Maps.newHashMap();
   private final aqr c;

   public dhz(aqr $$0) {
      this.c = $$0;
   }

   private List<aro> a(dgw $$0) {
      return (List<aro>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.c($$0));
   }

   public void a(dgw $$0, bwu $$1) {
      for (aro $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new dhz.a()).a($$1);
      }
   }

   public boolean a(bwu $$0, dgw $$1) {
      for (aro $$2 : this.a($$1)) {
         dhz.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bwu> a = new Object2IntOpenHashMap(bwu.values().length);

      public void a(bwu $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bwu $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
