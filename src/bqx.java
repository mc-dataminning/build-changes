import com.mojang.serialization.Codec;

public record bqx(String d) {
   public static final bqx a = new bqx("");
   public static final Codec<bqx> b = Codec.STRING.xmap(bqx::new, bqx::a);
   public static final String c = "Lock";

   public boolean a(cup $$0) {
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

   public static bqx b(us $$0) {
      return $$0.b("Lock", 8) ? new bqx($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
