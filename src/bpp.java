import com.mojang.serialization.Codec;

public record bpp(String d) {
   public static final bpp a = new bpp("");
   public static final Codec<bpp> b = Codec.STRING.xmap(bpp::new, bpp::a);
   public static final String c = "Lock";

   public boolean a(csz $$0) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         wu $$1 = $$0.a(ka.f);
         return $$1 != null && this.d.equals($$1.getString());
      }
   }

   public void a(ua $$0) {
      if (!this.d.isEmpty()) {
         $$0.a("Lock", this.d);
      }
   }

   public static bpp b(ua $$0) {
      return $$0.b("Lock", 8) ? new bpp($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
