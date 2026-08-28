import com.google.common.collect.Maps;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bok {
   public static final int a = 200;
   public static final int b = 10000;
   private final avn c;
   private final Map<bom, Map<aro, bok.b>> d;
   private final Queue<bok.a> e = new LinkedList<>();

   public bok(avn $$0) {
      this.c = $$0;
      this.d = af.a(bom.class, $$0x -> Maps.newHashMap());
   }

   public boolean a(bom $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(acr $$0) {
      for (aro $$2 : this.d.get($$0.e()).keySet()) {
         $$2.f.b($$0);
      }
   }

   public void a(aro $$0, bom $$1) {
      if (this.c.f($$0.gh())) {
         this.e.add(new bok.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = af.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bok.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bok.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<aro, bok.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((aro)$$2x.getKey()).gh());
            bok.b $$4 = (bok.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(aro a, bom b) {
   }

   static record b(long a, int b) {
   }
}
