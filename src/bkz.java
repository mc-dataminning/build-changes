import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bkz {
   public static final int a = 200;
   public static final int b = 10000;
   private final auq c;
   private final EnumMap<blb, Map<aqu, bkz.b>> d;
   private final Queue<bkz.a> e = new LinkedList<>();

   public bkz(auq $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(blb.class);

      for (blb $$1 : blb.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(blb $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(acy $$0) {
      for (aqu $$2 : this.d.get($$0.e()).keySet()) {
         $$2.d.b($$0);
      }
   }

   public void a(aqu $$0, blb $$1) {
      if (this.c.f($$0.gk())) {
         this.e.add(new bkz.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ad.b();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bkz.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bkz.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<aqu, bkz.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((aqu)$$2x.getKey()).gk());
            bkz.b $$4 = (bkz.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(aqu a, blb b) {
   }

   static record b(long a, int b) {
   }
}
