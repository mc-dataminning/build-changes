import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class biv {
   public static final int a = 200;
   public static final int b = 10000;
   private final atb c;
   private final EnumMap<bix, Map<apg, biv.b>> d;
   private final Queue<biv.a> e = new LinkedList<>();

   public biv(atb $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(bix.class);

      for (bix $$1 : bix.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(bix $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(abn $$0) {
      for (apg $$2 : this.d.get($$0.e()).keySet()) {
         $$2.d.b($$0);
      }
   }

   public void a(apg $$0, bix $$1) {
      if (this.c.f($$0.fY())) {
         this.e.add(new biv.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ac.b();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (biv.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new biv.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<apg, biv.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((apg)$$2x.getKey()).fY());
            biv.b $$4 = (biv.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(apg a, bix b) {
   }

   static record b(long a, int b) {
   }
}
