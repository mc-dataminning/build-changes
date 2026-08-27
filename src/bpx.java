import com.mojang.serialization.Codec;

public record bpx(String d) {
   public static final bpx a = new bpx("");
   public static final Codec<bpx> b = Codec.STRING.xmap(bpx::new, bpx::a);
   public static final String c = "Lock";

   public boolean a(cto $$0) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         wx $$1 = $$0.a(kb.f);
         return $$1 != null && this.d.equals($$1.getString());
      }
   }

   public void a(ud $$0) {
      if (!this.d.isEmpty()) {
         $$0.a("Lock", this.d);
      }
   }

   public static bpx b(ud $$0) {
      return $$0.b("Lock", 8) ? new bpx($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
