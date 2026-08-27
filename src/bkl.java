import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bkl {
   public static final int a = 200;
   public static final int b = 10000;
   private final aue c;
   private final EnumMap<bkn, Map<aqi, bkl.b>> d;
   private final Queue<bkl.a> e = new LinkedList<>();

   public bkl(aue $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(bkn.class);

      for (bkn $$1 : bkn.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(bkn $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(acn $$0) {
      for (aqi $$2 : this.d.get($$0.e()).keySet()) {
         $$2.d.b($$0);
      }
   }

   public void a(aqi $$0, bkn $$1) {
      if (this.c.f($$0.fZ())) {
         this.e.add(new bkl.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ac.b();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bkl.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bkl.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<aqi, bkl.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((aqi)$$2x.getKey()).fZ());
            bkl.b $$4 = (bkl.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(aqi a, bkn b) {
   }

   static record b(long a, int b) {
   }
}
