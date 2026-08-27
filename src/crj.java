import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class crj {
   private final Long2ObjectMap<List<alr>> a = new Long2ObjectOpenHashMap();
   private final Map<alr, crj.a> b = Maps.newHashMap();
   private final ala c;

   public crj(ala $$0) {
      this.c = $$0;
   }

   private List<alr> a(cqg $$0) {
      return (List<alr>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(cqg $$0, bkm $$1) {
      for (alr $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new crj.a()).a($$1);
      }
   }

   public boolean a(bkm $$0, cqg $$1) {
      for (alr $$2 : this.a($$1)) {
         crj.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bkm> a = new Object2IntOpenHashMap(bkm.values().length);

      public void a(bkm $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bkm $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
