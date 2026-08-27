import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class cqa {
   private final Long2ObjectMap<List<ako>> a = new Long2ObjectOpenHashMap();
   private final Map<ako, cqa.a> b = Maps.newHashMap();
   private final ajy c;

   public cqa(ajy $$0) {
      this.c = $$0;
   }

   private List<ako> a(cox $$0) {
      return (List<ako>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(cox $$0, bje $$1) {
      for (ako $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new cqa.a()).a($$1);
      }
   }

   public boolean a(bje $$0, cox $$1) {
      for (ako $$2 : this.a($$1)) {
         cqa.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bje> a = new Object2IntOpenHashMap(bje.values().length);

      public void a(bje $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bje $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
