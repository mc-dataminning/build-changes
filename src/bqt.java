import com.mojang.serialization.Codec;

public record bqt(String d) {
   public static final bqt a = new bqt("");
   public static final Codec<bqt> b = Codec.STRING.xmap(bqt::new, bqt::a);
   public static final String c = "Lock";

   public boolean a(cuo $$0) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         wy $$1 = $$0.a(kq.g);
         return $$1 != null && this.d.equals($$1.getString());
      }
   }

   public void a(ua $$0) {
      if (!this.d.isEmpty()) {
         $$0.a("Lock", this.d);
      }
   }

   public static bqt b(ua $$0) {
      return $$0.b("Lock", 8) ? new bqt($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
