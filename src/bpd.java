import com.google.common.collect.Maps;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bpd {
   public static final int a = 200;
   public static final int b = 10000;
   private final avu c;
   private final Map<bpf, Map<arv, bpd.b>> d;
   private final Queue<bpd.a> e = new LinkedList<>();

   public bpd(avu $$0) {
      this.c = $$0;
      this.d = ag.a(bpf.class, $$0x -> Maps.newHashMap());
   }

   public boolean a(bpf $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(acy $$0) {
      for (arv $$2 : this.d.get($$0.e()).keySet()) {
         $$2.f.b($$0);
      }
   }

   public void a(arv $$0, bpf $$1) {
      if (this.c.f($$0.gi())) {
         this.e.add(new bpd.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ag.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bpd.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bpd.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<arv, bpd.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((arv)$$2x.getKey()).gi());
            bpd.b $$4 = (bpd.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(arv a, bpf b) {
   }

   static record b(long a, int b) {
   }
}
