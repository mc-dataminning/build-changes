import com.google.common.collect.Maps;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bpb {
   public static final int a = 200;
   public static final int b = 10000;
   private final avs c;
   private final Map<bpd, Map<art, bpb.b>> d;
   private final Queue<bpb.a> e = new LinkedList<>();

   public bpb(avs $$0) {
      this.c = $$0;
      this.d = ag.a(bpd.class, $$0x -> Maps.newHashMap());
   }

   public boolean a(bpd $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(acw $$0) {
      for (art $$2 : this.d.get($$0.e()).keySet()) {
         $$2.f.b($$0);
      }
   }

   public void a(art $$0, bpd $$1) {
      if (this.c.f($$0.gi())) {
         this.e.add(new bpb.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ag.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bpb.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bpb.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<art, bpb.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((art)$$2x.getKey()).gi());
            bpb.b $$4 = (bpb.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(art a, bpd b) {
   }

   static record b(long a, int b) {
   }
}
