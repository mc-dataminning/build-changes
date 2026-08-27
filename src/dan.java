import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dan {
   private final Long2ObjectMap<List<aqi>> a = new Long2ObjectOpenHashMap();
   private final Map<aqi, dan.a> b = Maps.newHashMap();
   private final apq c;

   public dan(apq $$0) {
      this.c = $$0;
   }

   private List<aqi> a(czk $$0) {
      return (List<aqi>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(czk $$0, bsd $$1) {
      for (aqi $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new dan.a()).a($$1);
      }
   }

   public boolean a(bsd $$0, czk $$1) {
      for (aqi $$2 : this.a($$1)) {
         dan.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bsd> a = new Object2IntOpenHashMap(bsd.values().length);

      public void a(bsd $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bsd $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
