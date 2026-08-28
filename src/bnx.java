import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bnx {
   public static final int a = 200;
   public static final int b = 10000;
   private final awi c;
   private final EnumMap<bnz, Map<asi, bnx.b>> d;
   private final Queue<bnx.a> e = new LinkedList<>();

   public bnx(awi $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(bnz.class);

      for (bnz $$1 : bnz.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(bnz $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(ads $$0) {
      for (asi $$2 : this.d.get($$0.e()).keySet()) {
         $$2.f.b($$0);
      }
   }

   public void a(asi $$0, bnz $$1) {
      if (this.c.f($$0.gf())) {
         this.e.add(new bnx.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ae.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bnx.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bnx.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<asi, bnx.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((asi)$$2x.getKey()).gf());
            bnx.b $$4 = (bnx.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(asi a, bnz b) {
   }

   static record b(long a, int b) {
   }
}
