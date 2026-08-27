import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class czh {
   private final Long2ObjectMap<List<apt>> a = new Long2ObjectOpenHashMap();
   private final Map<apt, czh.a> b = Maps.newHashMap();
   private final apb c;

   public czh(apb $$0) {
      this.c = $$0;
   }

   private List<apt> a(cye $$0) {
      return (List<apt>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(cye $$0, bqr $$1) {
      for (apt $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new czh.a()).a($$1);
      }
   }

   public boolean a(bqr $$0, cye $$1) {
      for (apt $$2 : this.a($$1)) {
         czh.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bqr> a = new Object2IntOpenHashMap(bqr.values().length);

      public void a(bqr $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bqr $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
