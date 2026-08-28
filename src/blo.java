import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class blo {
   public static final int a = 200;
   public static final int b = 10000;
   private final auz c;
   private final EnumMap<blq, Map<arc, blo.b>> d;
   private final Queue<blo.a> e = new LinkedList<>();

   public blo(auz $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(blq.class);

      for (blq $$1 : blq.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(blq $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(adf $$0) {
      for (arc $$2 : this.d.get($$0.e()).keySet()) {
         $$2.c.b($$0);
      }
   }

   public void a(arc $$0, blq $$1) {
      if (this.c.f($$0.gb())) {
         this.e.add(new blo.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ac.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (blo.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new blo.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<arc, blo.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((arc)$$2x.getKey()).gb());
            blo.b $$4 = (blo.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(arc a, blq b) {
   }

   static record b(long a, int b) {
   }
}
