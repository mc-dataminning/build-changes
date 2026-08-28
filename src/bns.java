import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bns {
   public static final int a = 200;
   public static final int b = 10000;
   private final avy c;
   private final EnumMap<bnu, Map<ary, bns.b>> d;
   private final Queue<bns.a> e = new LinkedList<>();

   public bns(avy $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(bnu.class);

      for (bnu $$1 : bnu.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(bnu $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(adh $$0) {
      for (ary $$2 : this.d.get($$0.e()).keySet()) {
         $$2.f.b($$0);
      }
   }

   public void a(ary $$0, bnu $$1) {
      if (this.c.f($$0.gh())) {
         this.e.add(new bns.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ae.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bns.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bns.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<ary, bns.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((ary)$$2x.getKey()).gh());
            bns.b $$4 = (bns.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(ary a, bnu b) {
   }

   static record b(long a, int b) {
   }
}
