import com.mojang.serialization.Codec;

public record bqj(String d) {
   public static final bqj a = new bqj("");
   public static final Codec<bqj> b = Codec.STRING.xmap(bqj::new, bqj::a);
   public static final String c = "Lock";

   public boolean a(cuc $$0) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         wu $$1 = $$0.a(kn.g);
         return $$1 != null && this.d.equals($$1.getString());
      }
   }

   public void a(tx $$0) {
      if (!this.d.isEmpty()) {
         $$0.a("Lock", this.d);
      }
   }

   public static bqj b(tx $$0) {
      return $$0.b("Lock", 8) ? new bqj($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
