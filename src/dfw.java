import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dfw {
   private final Long2ObjectMap<List<arq>> a = new Long2ObjectOpenHashMap();
   private final Map<arq, dfw.a> b = Maps.newHashMap();
   private final aqu c;

   public dfw(aqu $$0) {
      this.c = $$0;
   }

   private List<arq> a(des $$0) {
      return (List<arq>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.c($$0));
   }

   public void a(des $$0, bvk $$1) {
      for (arq $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new dfw.a()).a($$1);
      }
   }

   public boolean a(bvk $$0, des $$1) {
      for (arq $$2 : this.a($$1)) {
         dfw.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bvk> a = new Object2IntOpenHashMap(bvk.values().length);

      public void a(bvk $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bvk $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
