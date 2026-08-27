import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class boh {
   private final Map<il<bqq>, boh.a> a = new Object2ObjectOpenHashMap();
   private final boi b;
   private final int c;
   @Nullable
   private String d;
   private int e;

   protected boh(boi $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public int b() {
      return this.e;
   }

   public boolean a(bpo $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bow $$0, @Nullable bow $$1, bpo $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bpo $$0, int $$1) {
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

   public boi f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public boh a(il<bqq> $$0, String $$1, double $$2, bqt.a $$3) {
      this.a.put($$0, new boh.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public boh a(int $$0) {
      this.e = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<il<bqq>, bqt> $$1) {
      this.a.forEach(($$2, $$3) -> $$1.accept((il<bqq>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(bqs $$0) {
      for (Entry<il<bqq>, boh.a> $$1 : this.a.entrySet()) {
         bqr $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bqs $$0, int $$1) {
      for (Entry<il<bqq>, boh.a> $$2 : this.a.entrySet()) {
         bqr $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.b == boi.a;
   }

   static record a(UUID a, double b, bqt.a c) {
      public bqt a(String $$0, int $$1) {
         return new bqt(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}
