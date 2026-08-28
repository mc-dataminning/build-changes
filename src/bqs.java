import com.mojang.serialization.Codec;

public record bqs(String d) {
   public static final bqs a = new bqs("");
   public static final Codec<bqs> b = Codec.STRING.xmap(bqs::new, bqs::a);
   public static final String c = "Lock";

   public boolean a(cuk $$0) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         xl $$1 = $$0.a(km.f);
         return $$1 != null && this.d.equals($$1.getString());
      }
   }

   public void a(ur $$0) {
      if (!this.d.isEmpty()) {
         $$0.a("Lock", this.d);
      }
   }

   public static bqs b(ur $$0) {
      return $$0.b("Lock", 8) ? new bqs($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
