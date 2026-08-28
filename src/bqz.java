import com.mojang.serialization.Codec;

public record bqz(String d) {
   public static final bqz a = new bqz("");
   public static final Codec<bqz> b = Codec.STRING.xmap(bqz::new, bqz::a);
   public static final String c = "Lock";

   public boolean a(cur $$0) {
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

   public static bqz b(us $$0) {
      return $$0.b("Lock", 8) ? new bqz($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
