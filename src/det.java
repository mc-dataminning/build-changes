import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class det {
   private final Long2ObjectMap<List<ark>> a = new Long2ObjectOpenHashMap();
   private final Map<ark, det.a> b = Maps.newHashMap();
   private final aqp c;

   public det(aqp $$0) {
      this.c = $$0;
   }

   private List<ark> a(ddp $$0) {
      return (List<ark>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.c($$0));
   }

   public void a(ddp $$0, buq $$1) {
      for (ark $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new det.a()).a($$1);
      }
   }

   public boolean a(buq $$0, ddp $$1) {
      for (ark $$2 : this.a($$1)) {
         det.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<buq> a = new Object2IntOpenHashMap(buq.values().length);

      public void a(buq $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(buq $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
