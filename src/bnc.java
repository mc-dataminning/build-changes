import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bnc {
   public static final int a = 200;
   public static final int b = 10000;
   private final avd c;
   private final EnumMap<bne, Map<are, bnc.b>> d;
   private final Queue<bnc.a> e = new LinkedList<>();

   public bnc(avd $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(bne.class);

      for (bne $$1 : bne.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(bne $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(acm $$0) {
      for (are $$2 : this.d.get($$0.e()).keySet()) {
         $$2.f.b($$0);
      }
   }

   public void a(are $$0, bne $$1) {
      if (this.c.f($$0.gh())) {
         this.e.add(new bnc.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = af.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bnc.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bnc.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<are, bnc.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((are)$$2x.getKey()).gh());
            bnc.b $$4 = (bnc.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(are a, bne b) {
   }

   static record b(long a, int b) {
   }
}
