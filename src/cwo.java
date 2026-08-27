import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class cwo {
   private final Long2ObjectMap<List<apb>> a = new Long2ObjectOpenHashMap();
   private final Map<apb, cwo.a> b = Maps.newHashMap();
   private final aok c;

   public cwo(aok $$0) {
      this.c = $$0;
   }

   private List<apb> a(cvl $$0) {
      return (List<apb>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(cvl $$0, bpa $$1) {
      for (apb $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new cwo.a()).a($$1);
      }
   }

   public boolean a(bpa $$0, cvl $$1) {
      for (apb $$2 : this.a($$1)) {
         cwo.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bpa> a = new Object2IntOpenHashMap(bpa.values().length);

      public void a(bpa $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bpa $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
