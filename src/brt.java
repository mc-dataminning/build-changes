import com.mojang.serialization.Codec;

public record brt(String d) {
   public static final brt a = new brt("");
   public static final Codec<brt> b = Codec.STRING.xmap(brt::new, brt::a);
   public static final String c = "Lock";

   public boolean a(cvs $$0) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         xe $$1 = $$0.a(ks.g);
         return $$1 != null && this.d.equals($$1.getString());
      }
   }

   public void a(ug $$0) {
      if (!this.d.isEmpty()) {
         $$0.a("Lock", this.d);
      }
   }

   public static brt b(ug $$0) {
      return $$0.b("Lock", 8) ? new brt($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
