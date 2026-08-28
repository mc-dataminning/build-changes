import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class boc {
   public static final int a = 200;
   public static final int b = 10000;
   private final awi c;
   private final EnumMap<boe, Map<asi, boc.b>> d;
   private final Queue<boc.a> e = new LinkedList<>();

   public boc(awi $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(boe.class);

      for (boe $$1 : boe.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(boe $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(ads $$0) {
      for (asi $$2 : this.d.get($$0.e()).keySet()) {
         $$2.f.b($$0);
      }
   }

   public void a(asi $$0, boe $$1) {
      if (this.c.f($$0.gh())) {
         this.e.add(new boc.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ae.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (boc.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new boc.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<asi, boc.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((asi)$$2x.getKey()).gh());
            boc.b $$4 = (boc.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(asi a, boe b) {
   }

   static record b(long a, int b) {
   }
}
