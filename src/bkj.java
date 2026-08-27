import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bkj {
   public static final int a = 200;
   public static final int b = 10000;
   private final aub c;
   private final EnumMap<bkl, Map<aqf, bkj.b>> d;
   private final Queue<bkj.a> e = new LinkedList<>();

   public bkj(aub $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(bkl.class);

      for (bkl $$1 : bkl.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(bkl $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(acl $$0) {
      for (aqf $$2 : this.d.get($$0.e()).keySet()) {
         $$2.d.b($$0);
      }
   }

   public void a(aqf $$0, bkl $$1) {
      if (this.c.f($$0.fZ())) {
         this.e.add(new bkj.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ac.b();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bkj.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bkj.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<aqf, bkj.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((aqf)$$2x.getKey()).fZ());
            bkj.b $$4 = (bkj.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(aqf a, bkl b) {
   }

   static record b(long a, int b) {
   }
}
