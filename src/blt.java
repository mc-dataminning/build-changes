import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class blt {
   public static final int a = 200;
   public static final int b = 10000;
   private final avd c;
   private final EnumMap<blv, Map<arg, blt.b>> d;
   private final Queue<blt.a> e = new LinkedList<>();

   public blt(avd $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(blv.class);

      for (blv $$1 : blv.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(blv $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(adj $$0) {
      for (arg $$2 : this.d.get($$0.e()).keySet()) {
         $$2.c.b($$0);
      }
   }

   public void a(arg $$0, blv $$1) {
      if (this.c.f($$0.gb())) {
         this.e.add(new blt.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ac.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (blt.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new blt.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<arg, blt.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((arg)$$2x.getKey()).gb());
            blt.b $$4 = (blt.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(arg a, blv b) {
   }

   static record b(long a, int b) {
   }
}
