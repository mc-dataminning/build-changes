import com.mojang.serialization.Codec;

public record brl(String d) {
   public static final brl a = new brl("");
   public static final Codec<brl> b = Codec.STRING.xmap(brl::new, brl::a);
   public static final String c = "Lock";

   public boolean a(cvl $$0) {
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

   public static brl b(uf $$0) {
      return $$0.b("Lock", 8) ? new brl($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
