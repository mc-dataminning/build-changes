import com.google.common.collect.Maps;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bov {
   public static final int a = 200;
   public static final int b = 10000;
   private final avq c;
   private final Map<box, Map<arr, bov.b>> d;
   private final Queue<bov.a> e = new LinkedList<>();

   public bov(avq $$0) {
      this.c = $$0;
      this.d = af.a(box.class, $$0x -> Maps.newHashMap());
   }

   public boolean a(box $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(acu $$0) {
      for (arr $$2 : this.d.get($$0.e()).keySet()) {
         $$2.f.b($$0);
      }
   }

   public void a(arr $$0, box $$1) {
      if (this.c.f($$0.gh())) {
         this.e.add(new bov.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = af.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bov.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bov.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<arr, bov.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((arr)$$2x.getKey()).gh());
            bov.b $$4 = (bov.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(arr a, box b) {
   }

   static record b(long a, int b) {
   }
}
