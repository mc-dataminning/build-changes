import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class boi {
   private final Map<il<bqr>, boi.a> a = new Object2ObjectOpenHashMap();
   private final boj b;
   private final int c;
   @Nullable
   private String d;
   private int e;

   protected boi(boj $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public int b() {
      return this.e;
   }

   public boolean a(bpp $$0, int $$1) {
      return true;
   }

   public void a(@Nullable box $$0, @Nullable box $$1, bpp $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bpp $$0, int $$1) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.d == null) {
         this.d = ac.a("effect", ki.d.b(this));
      }

      return this.d;
   }

   public String d() {
      return this.c();
   }

   public vu e() {
      return vu.c(this.d());
   }

   public boj f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public boi a(il<bqr> $$0, String $$1, double $$2, bqu.a $$3) {
      this.a.put($$0, new boi.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public boi a(int $$0) {
      this.e = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<il<bqr>, bqu> $$1) {
      this.a.forEach(($$2, $$3) -> $$1.accept((il<bqr>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(bqt $$0) {
      for (Entry<il<bqr>, boi.a> $$1 : this.a.entrySet()) {
         bqs $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bqt $$0, int $$1) {
      for (Entry<il<bqr>, boi.a> $$2 : this.a.entrySet()) {
         bqs $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.b == boj.a;
   }

   static record a(UUID a, double b, bqu.a c) {
      public bqu a(String $$0, int $$1) {
         return new bqu(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}
