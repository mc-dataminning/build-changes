import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bjy {
   public static final int a = 200;
   public static final int b = 10000;
   private final atr c;
   private final EnumMap<bka, Map<apv, bjy.b>> d;
   private final Queue<bjy.a> e = new LinkedList<>();

   public bjy(atr $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(bka.class);

      for (bka $$1 : bka.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(bka $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(acb $$0) {
      for (apv $$2 : this.d.get($$0.e()).keySet()) {
         $$2.d.b($$0);
      }
   }

   public void a(apv $$0, bka $$1) {
      if (this.c.f($$0.fY())) {
         this.e.add(new bjy.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ac.b();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bjy.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bjy.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<apv, bjy.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((apv)$$2x.getKey()).fY());
            bjy.b $$4 = (bjy.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(apv a, bka b) {
   }

   static record b(long a, int b) {
   }
}
