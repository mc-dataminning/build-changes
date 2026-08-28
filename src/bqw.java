import com.mojang.serialization.Codec;

public record bqw(String d) {
   public static final bqw a = new bqw("");
   public static final Codec<bqw> b = Codec.STRING.xmap(bqw::new, bqw::a);
   public static final String c = "Lock";

   public boolean a(cuo $$0) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         xo $$1 = $$0.a(km.g);
         return $$1 != null && this.d.equals($$1.getString());
      }
   }

   public void a(ur $$0) {
      if (!this.d.isEmpty()) {
         $$0.a("Lock", this.d);
      }
   }

   public static bqw b(ur $$0) {
      return $$0.b("Lock", 8) ? new bqw($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
