import com.mojang.serialization.Codec;

public record brq(String d) {
   public static final brq a = new brq("");
   public static final Codec<brq> b = Codec.STRING.xmap(brq::new, brq::a);
   public static final String c = "Lock";

   public boolean a(cvp $$0) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         xd $$1 = $$0.a(kr.g);
         return $$1 != null && this.d.equals($$1.getString());
      }
   }

   public void a(uf $$0) {
      if (!this.d.isEmpty()) {
         $$0.a("Lock", this.d);
      }
   }

   public static brq b(uf $$0) {
      return $$0.b("Lock", 8) ? new brq($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
