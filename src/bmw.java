import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bmw {
   public static final int a = 200;
   public static final int b = 10000;
   private final avo c;
   private final EnumMap<bmy, Map<aro, bmw.b>> d;
   private final Queue<bmw.a> e = new LinkedList<>();

   public bmw(avo $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(bmy.class);

      for (bmy $$1 : bmy.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(bmy $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(adf $$0) {
      for (aro $$2 : this.d.get($$0.e()).keySet()) {
         $$2.g.b($$0);
      }
   }

   public void a(aro $$0, bmy $$1) {
      if (this.c.f($$0.gj())) {
         this.e.add(new bmw.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ae.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bmw.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bmw.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<aro, bmw.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((aro)$$2x.getKey()).gj());
            bmw.b $$4 = (bmw.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(aro a, bmy b) {
   }

   static record b(long a, int b) {
   }
}
