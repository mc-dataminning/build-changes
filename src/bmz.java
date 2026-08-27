import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class bmz {
   private final Map<ij<bpg>, bmz.a> a = new Object2ObjectOpenHashMap();
   private final bna b;
   private final int c;
   @Nullable
   private String d;
   private int e;

   protected bmz(bna $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public int b() {
      return this.e;
   }

   public boolean a(bog $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bno $$0, @Nullable bno $$1, bog $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bog $$0, int $$1) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.d == null) {
         this.d = ac.a("effect", kf.d.b(this));
      }

      return this.d;
   }

   public String d() {
      return this.c();
   }

   public vq e() {
      return vq.c(this.d());
   }

   public bna f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public bmz a(ij<bpg> $$0, String $$1, double $$2, bpj.a $$3) {
      this.a.put($$0, new bmz.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bmz a(int $$0) {
      this.e = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<ij<bpg>, bpj> $$1) {
      this.a.forEach(($$2, $$3) -> $$1.accept((ij<bpg>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(bpi $$0) {
      for (Entry<ij<bpg>, bmz.a> $$1 : this.a.entrySet()) {
         bph $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bpi $$0, int $$1) {
      for (Entry<ij<bpg>, bmz.a> $$2 : this.a.entrySet()) {
         bph $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.b == bna.a;
   }

   static record a(UUID a, double b, bpj.a c) {
      public bpj a(String $$0, int $$1) {
         return new bpj(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}
