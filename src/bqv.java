import com.mojang.serialization.Codec;

public record bqv(String d) {
   public static final bqv a = new bqv("");
   public static final Codec<bqv> b = Codec.STRING.xmap(bqv::new, bqv::a);
   public static final String c = "Lock";

   public boolean a(cun $$0) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         xo $$1 = $$0.a(km.f);
         return $$1 != null && this.d.equals($$1.getString());
      }
   }

   public void a(ur $$0) {
      if (!this.d.isEmpty()) {
         $$0.a("Lock", this.d);
      }
   }

   public static bqv b(ur $$0) {
      return $$0.b("Lock", 8) ? new bqv($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
