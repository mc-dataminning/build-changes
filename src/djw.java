import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class djw {
   private final Long2ObjectMap<List<arr>> a = new Long2ObjectOpenHashMap();
   private final Map<arr, djw.a> b = Maps.newHashMap();
   private final aqu c;

   public djw(aqu $$0) {
      this.c = $$0;
   }

   private List<arr> a(dir $$0) {
      return (List<arr>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.c($$0));
   }

   public void a(dir $$0, bxm $$1) {
      for (arr $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new djw.a()).a($$1);
      }
   }

   public boolean a(bxm $$0, dir $$1) {
      for (arr $$2 : this.a($$1)) {
         djw.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bxm> a = new Object2IntOpenHashMap(bxm.values().length);

      public void a(bxm $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bxm $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
