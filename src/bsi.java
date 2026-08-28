import com.mojang.serialization.Codec;

public record bsi(String d) {
   public static final bsi a = new bsi("");
   public static final Codec<bsi> b = Codec.STRING.xmap(bsi::new, bsi::a);
   public static final String c = "Lock";

   public boolean a(cwf $$0) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         xl $$1 = $$0.a(ku.g);
         return $$1 != null && this.d.equals($$1.getString());
      }
   }

   public void a(un $$0) {
      if (!this.d.isEmpty()) {
         $$0.a("Lock", this.d);
      }
   }

   public static bsi b(un $$0) {
      return $$0.b("Lock", 8) ? new bsi($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
