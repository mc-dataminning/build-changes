import com.mojang.serialization.Codec;

public record bqg(String d) {
   public static final bqg a = new bqg("");
   public static final Codec<bqg> b = Codec.STRING.xmap(bqg::new, bqg::a);
   public static final String c = "Lock";

   public boolean a(cua $$0) {
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

   public static bqg b(tx $$0) {
      return $$0.b("Lock", 8) ? new bqg($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
