import com.google.common.collect.Maps;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bns {
   public static final int a = 200;
   public static final int b = 10000;
   private final avd c;
   private final Map<bnu, Map<are, bns.b>> d;
   private final Queue<bns.a> e = new LinkedList<>();

   public bns(avd $$0) {
      this.c = $$0;
      this.d = af.a(bnu.class, $$0x -> Maps.newHashMap());
   }

   public boolean a(bnu $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(acl $$0) {
      for (are $$2 : this.d.get($$0.e()).keySet()) {
         $$2.f.b($$0);
      }
   }

   public void a(are $$0, bnu $$1) {
      if (this.c.f($$0.gk())) {
         this.e.add(new bns.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = af.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bns.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bns.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<are, bns.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((are)$$2x.getKey()).gk());
            bns.b $$4 = (bns.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(are a, bnu b) {
   }

   static record b(long a, int b) {
   }
}
