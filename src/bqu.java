import com.mojang.serialization.Codec;

public record bqu(String d) {
   public static final bqu a = new bqu("");
   public static final Codec<bqu> b = Codec.STRING.xmap(bqu::new, bqu::a);
   public static final String c = "Lock";

   public boolean a(cuq $$0) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         wz $$1 = $$0.a(kq.g);
         return $$1 != null && this.d.equals($$1.getString());
      }
   }

   public void a(ub $$0) {
      if (!this.d.isEmpty()) {
         $$0.a("Lock", this.d);
      }
   }

   public static bqu b(ub $$0) {
      return $$0.b("Lock", 8) ? new bqu($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
