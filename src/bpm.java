import com.google.common.collect.Maps;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bpm {
   public static final int a = 200;
   public static final int b = 10000;
   private final awb c;
   private final Map<bpo, Map<asc, bpm.b>> d;
   private final Queue<bpm.a> e = new LinkedList<>();

   public bpm(awb $$0) {
      this.c = $$0;
      this.d = ag.a(bpo.class, $$0x -> Maps.newHashMap());
   }

   public boolean a(bpo $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(adf $$0) {
      for (asc $$2 : this.d.get($$0.e()).keySet()) {
         $$2.f.b($$0);
      }
   }

   public void a(asc $$0, bpo $$1) {
      if (this.c.f($$0.gi())) {
         this.e.add(new bpm.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ag.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bpm.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bpm.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<asc, bpm.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((asc)$$2x.getKey()).gi());
            bpm.b $$4 = (bpm.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(asc a, bpo b) {
   }

   static record b(long a, int b) {
   }
}
