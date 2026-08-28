import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bnb {
   public static final int a = 200;
   public static final int b = 10000;
   private final avd c;
   private final EnumMap<bnd, Map<ard, bnb.b>> d;
   private final Queue<bnb.a> e = new LinkedList<>();

   public bnb(avd $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(bnd.class);

      for (bnd $$1 : bnd.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(bnd $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(acl $$0) {
      for (ard $$2 : this.d.get($$0.e()).keySet()) {
         $$2.f.b($$0);
      }
   }

   public void a(ard $$0, bnd $$1) {
      if (this.c.f($$0.gh())) {
         this.e.add(new bnb.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = af.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bnb.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bnb.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<ard, bnb.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((ard)$$2x.getKey()).gh());
            bnb.b $$4 = (bnb.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(ard a, bnd b) {
   }

   static record b(long a, int b) {
   }
}
