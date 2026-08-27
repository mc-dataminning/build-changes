import com.mojang.serialization.Codec;

public record bod(String d) {
   public static final bod a = new bod("");
   public static final Codec<bod> b = Codec.STRING.xmap(bod::new, bod::a);
   public static final String c = "Lock";

   public boolean a(crj $$0) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         wg $$1 = $$0.a(jp.d);
         return $$1 != null && this.d.equals($$1.getString());
      }
   }

   public void a(tm $$0) {
      if (!this.d.isEmpty()) {
         $$0.a("Lock", this.d);
      }
   }

   public static bod b(tm $$0) {
      return $$0.b("Lock", 8) ? new bod($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
