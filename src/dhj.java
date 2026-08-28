import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dhj {
   private final Long2ObjectMap<List<ary>> a = new Long2ObjectOpenHashMap();
   private final Map<ary, dhj.a> b = Maps.newHashMap();
   private final arc c;

   public dhj(arc $$0) {
      this.c = $$0;
   }

   private List<ary> a(dgf $$0) {
      return (List<ary>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.c($$0));
   }

   public void a(dgf $$0, bwa $$1) {
      for (ary $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new dhj.a()).a($$1);
      }
   }

   public boolean a(bwa $$0, dgf $$1) {
      for (ary $$2 : this.a($$1)) {
         dhj.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bwa> a = new Object2IntOpenHashMap(bwa.values().length);

      public void a(bwa $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bwa $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
