import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class deq {
   private final Long2ObjectMap<List<ari>> a = new Long2ObjectOpenHashMap();
   private final Map<ari, deq.a> b = Maps.newHashMap();
   private final aqn c;

   public deq(aqn $$0) {
      this.c = $$0;
   }

   private List<ari> a(ddm $$0) {
      return (List<ari>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.c($$0));
   }

   public void a(ddm $$0, bun $$1) {
      for (ari $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new deq.a()).a($$1);
      }
   }

   public boolean a(bun $$0, ddm $$1) {
      for (ari $$2 : this.a($$1)) {
         deq.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bun> a = new Object2IntOpenHashMap(bun.values().length);

      public void a(bun $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bun $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
