import com.google.common.collect.Maps;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bos {
   public static final int a = 200;
   public static final int b = 10000;
   private final avo c;
   private final Map<bou, Map<arp, bos.b>> d;
   private final Queue<bos.a> e = new LinkedList<>();

   public bos(avo $$0) {
      this.c = $$0;
      this.d = af.a(bou.class, $$0x -> Maps.newHashMap());
   }

   public boolean a(bou $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(acs $$0) {
      for (arp $$2 : this.d.get($$0.e()).keySet()) {
         $$2.f.b($$0);
      }
   }

   public void a(arp $$0, bou $$1) {
      if (this.c.f($$0.gh())) {
         this.e.add(new bos.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = af.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bos.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bos.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<arp, bos.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((arp)$$2x.getKey()).gh());
            bos.b $$4 = (bos.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(arp a, bou b) {
   }

   static record b(long a, int b) {
   }
}
