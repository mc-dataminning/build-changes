import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class bnb {
   private final Map<ij<bpk>, bnb.a> a = new Object2ObjectOpenHashMap();
   private final bnc b;
   private final int c;
   @Nullable
   private String d;
   private int e;

   protected bnb(bnc $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public int b() {
      return this.e;
   }

   public boolean a(boi $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bnq $$0, @Nullable bnq $$1, boi $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(boi $$0, int $$1) {
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

   public bnc f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public bnb a(ij<bpk> $$0, String $$1, double $$2, bpn.a $$3) {
      this.a.put($$0, new bnb.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bnb a(int $$0) {
      this.e = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<ij<bpk>, bpn> $$1) {
      this.a.forEach(($$2, $$3) -> $$1.accept((ij<bpk>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(bpm $$0) {
      for (Entry<ij<bpk>, bnb.a> $$1 : this.a.entrySet()) {
         bpl $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bpm $$0, int $$1) {
      for (Entry<ij<bpk>, bnb.a> $$2 : this.a.entrySet()) {
         bpl $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.b == bnc.a;
   }

   static record a(UUID a, double b, bpn.a c) {
      public bpn a(String $$0, int $$1) {
         return new bpn(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}
