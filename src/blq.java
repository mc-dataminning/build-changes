import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class blq {
   public static final int a = 200;
   public static final int b = 10000;
   private final aur c;
   private final EnumMap<bls, Map<aqv, blq.b>> d;
   private final Queue<blq.a> e = new LinkedList<>();

   public blq(aur $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(bls.class);

      for (bls $$1 : bls.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(bls $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(acv $$0) {
      for (aqv $$2 : this.d.get($$0.e()).keySet()) {
         $$2.c.b($$0);
      }
   }

   public void a(aqv $$0, bls $$1) {
      if (this.c.f($$0.fX())) {
         this.e.add(new blq.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ad.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (blq.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new blq.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<aqv, blq.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((aqv)$$2x.getKey()).fX());
            blq.b $$4 = (blq.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(aqv a, bls b) {
   }

   static record b(long a, int b) {
   }
}
