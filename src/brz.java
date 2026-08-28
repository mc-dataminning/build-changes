import com.mojang.serialization.Codec;

public record brz(String d) {
   public static final brz a = new brz("");
   public static final Codec<brz> b = Codec.STRING.xmap(brz::new, brz::a);
   public static final String c = "Lock";

   public boolean a(cvx $$0) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         xh $$1 = $$0.a(kt.g);
         return $$1 != null && this.d.equals($$1.getString());
      }
   }

   public void a(uj $$0) {
      if (!this.d.isEmpty()) {
         $$0.a("Lock", this.d);
      }
   }

   public static brz b(uj $$0) {
      return $$0.b("Lock", 8) ? new brz($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
