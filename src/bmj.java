import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bmj {
   public static final int a = 200;
   public static final int b = 10000;
   private final avg c;
   private final EnumMap<bml, Map<arh, bmj.b>> d;
   private final Queue<bmj.a> e = new LinkedList<>();

   public bmj(avg $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(bml.class);

      for (bml $$1 : bml.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(bml $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(ada $$0) {
      for (arh $$2 : this.d.get($$0.e()).keySet()) {
         $$2.c.b($$0);
      }
   }

   public void a(arh $$0, bml $$1) {
      if (this.c.f($$0.gb())) {
         this.e.add(new bmj.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ad.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bmj.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bmj.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<arh, bmj.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((arh)$$2x.getKey()).gb());
            bmj.b $$4 = (bmj.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(arh a, bml b) {
   }

   static record b(long a, int b) {
   }
}
