import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class czq {
   private final Long2ObjectMap<List<apv>> a = new Long2ObjectOpenHashMap();
   private final Map<apv, czq.a> b = Maps.newHashMap();
   private final apd c;

   public czq(apd $$0) {
      this.c = $$0;
   }

   private List<apv> a(cyn $$0) {
      return (List<apv>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(cyn $$0, bqw $$1) {
      for (apv $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new czq.a()).a($$1);
      }
   }

   public boolean a(bqw $$0, cyn $$1) {
      for (apv $$2 : this.a($$1)) {
         czq.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bqw> a = new Object2IntOpenHashMap(bqw.values().length);

      public void a(bqw $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bqw $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
