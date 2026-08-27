import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class bnq {
   private final Map<il<bpz>, bnq.a> a = new Object2ObjectOpenHashMap();
   private final bnr b;
   private final int c;
   @Nullable
   private String d;
   private int e;

   protected bnq(bnr $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public int b() {
      return this.e;
   }

   public boolean a(box $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bof $$0, @Nullable bof $$1, box $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(box $$0, int $$1) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.d == null) {
         this.d = ac.a("effect", kh.d.b(this));
      }

      return this.d;
   }

   public String d() {
      return this.c();
   }

   public vs e() {
      return vs.c(this.d());
   }

   public bnr f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public bnq a(il<bpz> $$0, String $$1, double $$2, bqc.a $$3) {
      this.a.put($$0, new bnq.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bnq a(int $$0) {
      this.e = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<il<bpz>, bqc> $$1) {
      this.a.forEach(($$2, $$3) -> $$1.accept((il<bpz>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(bqb $$0) {
      for (Entry<il<bpz>, bnq.a> $$1 : this.a.entrySet()) {
         bqa $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bqb $$0, int $$1) {
      for (Entry<il<bpz>, bnq.a> $$2 : this.a.entrySet()) {
         bqa $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.b == bnr.a;
   }

   static record a(UUID a, double b, bqc.a c) {
      public bqc a(String $$0, int $$1) {
         return new bqc(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}
