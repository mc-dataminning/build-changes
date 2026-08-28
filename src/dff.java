import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dff {
   private final Long2ObjectMap<List<arn>> a = new Long2ObjectOpenHashMap();
   private final Map<arn, dff.a> b = Maps.newHashMap();
   private final aqs c;

   public dff(aqs $$0) {
      this.c = $$0;
   }

   private List<arn> a(deb $$0) {
      return (List<arn>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.c($$0));
   }

   public void a(deb $$0, buy $$1) {
      for (arn $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new dff.a()).a($$1);
      }
   }

   public boolean a(buy $$0, deb $$1) {
      for (arn $$2 : this.a($$1)) {
         dff.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<buy> a = new Object2IntOpenHashMap(buy.values().length);

      public void a(buy $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(buy $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
