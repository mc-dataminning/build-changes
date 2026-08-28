import com.mojang.serialization.Codec;

public record bqy(String d) {
   public static final bqy a = new bqy("");
   public static final Codec<bqy> b = Codec.STRING.xmap(bqy::new, bqy::a);
   public static final String c = "Lock";

   public boolean a(cuq $$0) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         xp $$1 = $$0.a(km.g);
         return $$1 != null && this.d.equals($$1.getString());
      }
   }

   public void a(us $$0) {
      if (!this.d.isEmpty()) {
         $$0.a("Lock", this.d);
      }
   }

   public static bqy b(us $$0) {
      return $$0.b("Lock", 8) ? new bqy($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
