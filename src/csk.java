import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class csk {
   private final Long2ObjectMap<List<amf>> a = new Long2ObjectOpenHashMap();
   private final Map<amf, csk.a> b = Maps.newHashMap();
   private final alo c;

   public csk(alo $$0) {
      this.c = $$0;
   }

   private List<amf> a(crh $$0) {
      return (List<amf>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.d($$0));
   }

   public void a(crh $$0, blj $$1) {
      for (amf $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new csk.a()).a($$1);
      }
   }

   public boolean a(blj $$0, crh $$1) {
      for (amf $$2 : this.a($$1)) {
         csk.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<blj> a = new Object2IntOpenHashMap(blj.values().length);

      public void a(blj $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(blj $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
