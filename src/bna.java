import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bna {
   public static final int a = 200;
   public static final int b = 10000;
   private final avr c;
   private final EnumMap<bnc, Map<arr, bna.b>> d;
   private final Queue<bna.a> e = new LinkedList<>();

   public bna(avr $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(bnc.class);

      for (bnc $$1 : bnc.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(bnc $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(adi $$0) {
      for (arr $$2 : this.d.get($$0.e()).keySet()) {
         $$2.g.b($$0);
      }
   }

   public void a(arr $$0, bnc $$1) {
      if (this.c.f($$0.gk())) {
         this.e.add(new bna.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ae.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bna.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bna.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<arr, bna.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((arr)$$2x.getKey()).gk());
            bna.b $$4 = (bna.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(arr a, bnc b) {
   }

   static record b(long a, int b) {
   }
}
