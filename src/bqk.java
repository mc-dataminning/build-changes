import com.mojang.serialization.Codec;

public record bqk(String d) {
   public static final bqk a = new bqk("");
   public static final Codec<bqk> b = Codec.STRING.xmap(bqk::new, bqk::a);
   public static final String c = "Lock";

   public boolean a(cud $$0) {
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

   public static bqk b(tx $$0) {
      return $$0.b("Lock", 8) ? new bqk($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
