import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class cmw {
   private final Long2ObjectMap<List<aig>> a = new Long2ObjectOpenHashMap();
   private final Map<aig, cmw.a> b = Maps.newHashMap();
   private final ahr c;

   public cmw(ahr $$0) {
      this.c = $$0;
   }

   private List<aig> a(clt $$0) {
      return (List<aig>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(clt $$0, bgc $$1) {
      for (aig $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new cmw.a()).a($$1);
      }
   }

   public boolean a(bgc $$0, clt $$1) {
      for (aig $$2 : this.a($$1)) {
         cmw.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bgc> a = new Object2IntOpenHashMap(bgc.values().length);

      public void a(bgc $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bgc $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
