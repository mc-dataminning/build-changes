import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dcq {
   private final Long2ObjectMap<List<aqn>> a = new Long2ObjectOpenHashMap();
   private final Map<aqn, dcq.a> b = Maps.newHashMap();
   private final apt c;

   public dcq(apt $$0) {
      this.c = $$0;
   }

   private List<aqn> a(dbn $$0) {
      return (List<aqn>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.c($$0));
   }

   public void a(dbn $$0, btf $$1) {
      for (aqn $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new dcq.a()).a($$1);
      }
   }

   public boolean a(btf $$0, dbn $$1) {
      for (aqn $$2 : this.a($$1)) {
         dcq.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<btf> a = new Object2IntOpenHashMap(btf.values().length);

      public void a(btf $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(btf $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
