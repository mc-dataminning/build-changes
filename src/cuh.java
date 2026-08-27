import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class cuh {
   private final Long2ObjectMap<List<anf>> a = new Long2ObjectOpenHashMap();
   private final Map<anf, cuh.a> b = Maps.newHashMap();
   private final amo c;

   public cuh(amo $$0) {
      this.c = $$0;
   }

   private List<anf> a(cte $$0) {
      return (List<anf>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(cte $$0, bmr $$1) {
      for (anf $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new cuh.a()).a($$1);
      }
   }

   public boolean a(bmr $$0, cte $$1) {
      for (anf $$2 : this.a($$1)) {
         cuh.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bmr> a = new Object2IntOpenHashMap(bmr.values().length);

      public void a(bmr $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bmr $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
