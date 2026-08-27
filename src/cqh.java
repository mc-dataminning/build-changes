import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class cqh {
   private final Long2ObjectMap<List<akt>> a = new Long2ObjectOpenHashMap();
   private final Map<akt, cqh.a> b = Maps.newHashMap();
   private final akc c;

   public cqh(akc $$0) {
      this.c = $$0;
   }

   private List<akt> a(cpe $$0) {
      return (List<akt>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(cpe $$0, bjl $$1) {
      for (akt $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new cqh.a()).a($$1);
      }
   }

   public boolean a(bjl $$0, cpe $$1) {
      for (akt $$2 : this.a($$1)) {
         cqh.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bjl> a = new Object2IntOpenHashMap(bjl.values().length);

      public void a(bjl $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bjl $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
