import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dae {
   private final Long2ObjectMap<List<aqf>> a = new Long2ObjectOpenHashMap();
   private final Map<aqf, dae.a> b = Maps.newHashMap();
   private final apn c;

   public dae(apn $$0) {
      this.c = $$0;
   }

   private List<aqf> a(czb $$0) {
      return (List<aqf>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(czb $$0, brh $$1) {
      for (aqf $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new dae.a()).a($$1);
      }
   }

   public boolean a(brh $$0, czb $$1) {
      for (aqf $$2 : this.a($$1)) {
         dae.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<brh> a = new Object2IntOpenHashMap(brh.values().length);

      public void a(brh $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(brh $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
