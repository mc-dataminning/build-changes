import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class blc {
   public static final int a = 200;
   public static final int b = 10000;
   private final auh c;
   private final EnumMap<ble, Map<aql, blc.b>> d;
   private final Queue<blc.a> e = new LinkedList<>();

   public blc(auh $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(ble.class);

      for (ble $$1 : ble.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(ble $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(aco $$0) {
      for (aql $$2 : this.d.get($$0.e()).keySet()) {
         $$2.c.b($$0);
      }
   }

   public void a(aql $$0, ble $$1) {
      if (this.c.f($$0.fX())) {
         this.e.add(new blc.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ac.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (blc.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new blc.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<aql, blc.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((aql)$$2x.getKey()).fX());
            blc.b $$4 = (blc.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(aql a, ble b) {
   }

   static record b(long a, int b) {
   }
}
