import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class cty {
   private final Long2ObjectMap<List<ane>> a = new Long2ObjectOpenHashMap();
   private final Map<ane, cty.a> b = Maps.newHashMap();
   private final amn c;

   public cty(amn $$0) {
      this.c = $$0;
   }

   private List<ane> a(csv $$0) {
      return (List<ane>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(csv $$0, bmn $$1) {
      for (ane $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new cty.a()).a($$1);
      }
   }

   public boolean a(bmn $$0, csv $$1) {
      for (ane $$2 : this.a($$1)) {
         cty.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bmn> a = new Object2IntOpenHashMap(bmn.values().length);

      public void a(bmn $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bmn $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
