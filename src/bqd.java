import com.mojang.serialization.Codec;

public record bqd(String d) {
   public static final bqd a = new bqd("");
   public static final Codec<bqd> b = Codec.STRING.xmap(bqd::new, bqd::a);
   public static final String c = "Lock";

   public boolean a(cuh $$0) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         xe $$1 = $$0.a(ke.f);
         return $$1 != null && this.d.equals($$1.getString());
      }
   }

   public void a(uk $$0) {
      if (!this.d.isEmpty()) {
         $$0.a("Lock", this.d);
      }
   }

   public static bqd b(uk $$0) {
      return $$0.b("Lock", 8) ? new bqd($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
