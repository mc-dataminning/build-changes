import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bkv {
   public static final int a = 200;
   public static final int b = 10000;
   private final auk c;
   private final EnumMap<bkx, Map<aqo, bkv.b>> d;
   private final Queue<bkv.a> e = new LinkedList<>();

   public bkv(auk $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(bkx.class);

      for (bkx $$1 : bkx.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(bkx $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(acr $$0) {
      for (aqo $$2 : this.d.get($$0.e()).keySet()) {
         $$2.c.b($$0);
      }
   }

   public void a(aqo $$0, bkx $$1) {
      if (this.c.f($$0.gb())) {
         this.e.add(new bkv.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ac.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bkv.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bkv.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<aqo, bkv.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((aqo)$$2x.getKey()).gb());
            bkv.b $$4 = (bkv.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(aqo a, bkx b) {
   }

   static record b(long a, int b) {
   }
}
