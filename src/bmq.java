import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bmq {
   public static final int a = 200;
   public static final int b = 10000;
   private final avj c;
   private final EnumMap<bms, Map<ark, bmq.b>> d;
   private final Queue<bmq.a> e = new LinkedList<>();

   public bmq(avj $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(bms.class);

      for (bms $$1 : bms.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(bms $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(adb $$0) {
      for (ark $$2 : this.d.get($$0.e()).keySet()) {
         $$2.c.b($$0);
      }
   }

   public void a(ark $$0, bms $$1) {
      if (this.c.f($$0.gc())) {
         this.e.add(new bmq.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ad.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bmq.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bmq.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<ark, bmq.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((ark)$$2x.getKey()).gc());
            bmq.b $$4 = (bmq.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(ark a, bms b) {
   }

   static record b(long a, int b) {
   }
}
