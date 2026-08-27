import com.mojang.serialization.Codec;

public record boi(String d) {
   public static final boi a = new boi("");
   public static final Codec<boi> b = Codec.STRING.xmap(boi::new, boi::a);
   public static final String c = "Lock";

   public boolean a(crs $$0) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         wi $$1 = $$0.a(jr.d);
         return $$1 != null && this.d.equals($$1.getString());
      }
   }

   public void a(to $$0) {
      if (!this.d.isEmpty()) {
         $$0.a("Lock", this.d);
      }
   }

   public static boi b(to $$0) {
      return $$0.b("Lock", 8) ? new boi($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
