import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class cvx {
   private final Long2ObjectMap<List<aow>> a = new Long2ObjectOpenHashMap();
   private final Map<aow, cvx.a> b = Maps.newHashMap();
   private final aof c;

   public cvx(aof $$0) {
      this.c = $$0;
   }

   private List<aow> a(cuu $$0) {
      return (List<aow>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(cuu $$0, boj $$1) {
      for (aow $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new cvx.a()).a($$1);
      }
   }

   public boolean a(boj $$0, cuu $$1) {
      for (aow $$2 : this.a($$1)) {
         cvx.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<boj> a = new Object2IntOpenHashMap(boj.values().length);

      public void a(boj $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(boj $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
