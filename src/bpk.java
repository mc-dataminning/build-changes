import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class bpk {
   private final Map<in<brv>, bpk.a> a = new Object2ObjectOpenHashMap();
   private final bpl b;
   private final int c;
   @Nullable
   private String d;
   private int e;

   protected bpk(bpl $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public int b() {
      return this.e;
   }

   public boolean a(bqt $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bqa $$0, @Nullable bqa $$1, bqt $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bqt $$0, int $$1) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.d == null) {
         this.d = ac.a("effect", kt.d.b(this));
      }

      return this.d;
   }

   public String d() {
      return this.c();
   }

   public wi e() {
      return wi.c(this.d());
   }

   public bpl f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public bpk a(in<brv> $$0, String $$1, double $$2, bry.a $$3) {
      this.a.put($$0, new bpk.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bpk a(int $$0) {
      this.e = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<in<brv>, bry> $$1) {
      this.a.forEach(($$2, $$3) -> $$1.accept((in<brv>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(brx $$0) {
      for (Entry<in<brv>, bpk.a> $$1 : this.a.entrySet()) {
         brw $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(brx $$0, int $$1) {
      for (Entry<in<brv>, bpk.a> $$2 : this.a.entrySet()) {
         brw $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.b == bpl.a;
   }

   static record a(UUID a, double b, bry.a c) {
      public bry a(String $$0, int $$1) {
         return new bry(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}
