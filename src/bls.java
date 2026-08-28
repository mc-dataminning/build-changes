import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bls {
   public static final int a = 200;
   public static final int b = 10000;
   private final avc c;
   private final EnumMap<blu, Map<arf, bls.b>> d;
   private final Queue<bls.a> e = new LinkedList<>();

   public bls(avc $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(blu.class);

      for (blu $$1 : blu.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(blu $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(adi $$0) {
      for (arf $$2 : this.d.get($$0.e()).keySet()) {
         $$2.c.b($$0);
      }
   }

   public void a(arf $$0, blu $$1) {
      if (this.c.f($$0.gb())) {
         this.e.add(new bls.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ac.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bls.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bls.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<arf, bls.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((arf)$$2x.getKey()).gb());
            bls.b $$4 = (bls.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(arf a, blu b) {
   }

   static record b(long a, int b) {
   }
}
