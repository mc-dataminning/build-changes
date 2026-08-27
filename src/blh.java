import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class blh {
   private final Map<ih<bnp>, blh.a> a = new Object2ObjectOpenHashMap();
   private final bli b;
   private final int c;
   @Nullable
   private String d;
   private int e;

   protected blh(bli $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public int b() {
      return this.e;
   }

   public boolean a(bmo $$0, int $$1) {
      return true;
   }

   public void a(@Nullable blw $$0, @Nullable blw $$1, bmo $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bmo $$0, int $$1) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.d == null) {
         this.d = ac.a("effect", kd.d.b(this));
      }

      return this.d;
   }

   public String d() {
      return this.c();
   }

   public vg e() {
      return vg.c(this.d());
   }

   public bli f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public blh a(ih<bnp> $$0, String $$1, double $$2, bns.a $$3) {
      this.a.put($$0, new blh.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public blh a(int $$0) {
      this.e = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<ih<bnp>, bns> $$1) {
      this.a.forEach(($$2, $$3) -> $$1.accept((ih<bnp>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(bnr $$0) {
      for (Entry<ih<bnp>, blh.a> $$1 : this.a.entrySet()) {
         bnq $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bnr $$0, int $$1) {
      for (Entry<ih<bnp>, blh.a> $$2 : this.a.entrySet()) {
         bnq $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.b == bli.a;
   }

   static record a(UUID a, double b, bns.a c) {
      public bns a(String $$0, int $$1) {
         return new bns(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}
