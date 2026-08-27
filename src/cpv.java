import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class cpv {
   private final Long2ObjectMap<List<akl>> a = new Long2ObjectOpenHashMap();
   private final Map<akl, cpv.a> b = Maps.newHashMap();
   private final ajv c;

   public cpv(ajv $$0) {
      this.c = $$0;
   }

   private List<akl> a(cos $$0) {
      return (List<akl>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(cos $$0, bjb $$1) {
      for (akl $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new cpv.a()).a($$1);
      }
   }

   public boolean a(bjb $$0, cos $$1) {
      for (akl $$2 : this.a($$1)) {
         cpv.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bjb> a = new Object2IntOpenHashMap(bjb.values().length);

      public void a(bjb $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bjb $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
