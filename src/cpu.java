import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class cpu {
   private final Long2ObjectMap<List<akj>> a = new Long2ObjectOpenHashMap();
   private final Map<akj, cpu.a> b = Maps.newHashMap();
   private final ajt c;

   public cpu(ajt $$0) {
      this.c = $$0;
   }

   private List<akj> a(cor $$0) {
      return (List<akj>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(cor $$0, biz $$1) {
      for (akj $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new cpu.a()).a($$1);
      }
   }

   public boolean a(biz $$0, cor $$1) {
      for (akj $$2 : this.a($$1)) {
         cpu.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<biz> a = new Object2IntOpenHashMap(biz.values().length);

      public void a(biz $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(biz $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
