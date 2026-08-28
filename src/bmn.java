import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bmn {
   public static final int a = 200;
   public static final int b = 10000;
   private final avh c;
   private final EnumMap<bmp, Map<ari, bmn.b>> d;
   private final Queue<bmn.a> e = new LinkedList<>();

   public bmn(avh $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(bmp.class);

      for (bmp $$1 : bmp.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(bmp $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(ada $$0) {
      for (ari $$2 : this.d.get($$0.e()).keySet()) {
         $$2.c.b($$0);
      }
   }

   public void a(ari $$0, bmp $$1) {
      if (this.c.f($$0.gb())) {
         this.e.add(new bmn.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ad.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bmn.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bmn.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<ari, bmn.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((ari)$$2x.getKey()).gb());
            bmn.b $$4 = (bmn.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(ari a, bmp b) {
   }

   static record b(long a, int b) {
   }
}
