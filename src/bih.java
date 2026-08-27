import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bih {
   public static final int a = 200;
   public static final int b = 10000;
   private final ass c;
   private final EnumMap<bij, Map<apb, bih.b>> d;
   private final Queue<bih.a> e = new LinkedList<>();

   public bih(ass $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(bij.class);

      for (bij $$1 : bij.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(bij $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(abj $$0) {
      for (apb $$2 : this.d.get($$0.e()).keySet()) {
         $$2.d.b($$0);
      }
   }

   public void a(apb $$0, bij $$1) {
      if (this.c.f($$0.fU())) {
         this.e.add(new bih.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ac.b();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bih.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bih.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<apb, bih.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((apb)$$2x.getKey()).fU());
            bih.b $$4 = (bih.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(apb a, bij b) {
   }

   static record b(long a, int b) {
   }
}
