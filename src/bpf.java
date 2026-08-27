import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class bpf {
   private final Map<il<brq>, bpf.a> a = new Object2ObjectOpenHashMap();
   private final bpg b;
   private final int c;
   @Nullable
   private String d;
   private int e;

   protected bpf(bpg $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public int b() {
      return this.e;
   }

   public boolean a(bqo $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bpv $$0, @Nullable bpv $$1, bqo $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bqo $$0, int $$1) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.d == null) {
         this.d = ac.a("effect", kr.d.b(this));
      }

      return this.d;
   }

   public String d() {
      return this.c();
   }

   public wg e() {
      return wg.c(this.d());
   }

   public bpg f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public bpf a(il<brq> $$0, String $$1, double $$2, brt.a $$3) {
      this.a.put($$0, new bpf.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bpf a(int $$0) {
      this.e = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<il<brq>, brt> $$1) {
      this.a.forEach(($$2, $$3) -> $$1.accept((il<brq>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(brs $$0) {
      for (Entry<il<brq>, bpf.a> $$1 : this.a.entrySet()) {
         brr $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(brs $$0, int $$1) {
      for (Entry<il<brq>, bpf.a> $$2 : this.a.entrySet()) {
         brr $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.b == bpg.a;
   }

   static record a(UUID a, double b, brt.a c) {
      public brt a(String $$0, int $$1) {
         return new brt(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}
