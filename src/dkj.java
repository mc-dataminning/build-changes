import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dkj {
   private final Long2ObjectMap<List<arv>> a = new Long2ObjectOpenHashMap();
   private final Map<arv, dkj.a> b = Maps.newHashMap();
   private final aqy c;

   public dkj(aqy $$0) {
      this.c = $$0;
   }

   private List<arv> a(dje $$0) {
      return (List<arv>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.c($$0));
   }

   public void a(dje $$0, bxz $$1) {
      for (arv $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new dkj.a()).a($$1);
      }
   }

   public boolean a(bxz $$0, dje $$1) {
      for (arv $$2 : this.a($$1)) {
         dkj.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bxz> a = new Object2IntOpenHashMap(bxz.values().length);

      public void a(bxz $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bxz $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
