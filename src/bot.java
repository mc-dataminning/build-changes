import com.mojang.serialization.Codec;

public record bot(String d) {
   public static final bot a = new bot("");
   public static final Codec<bot> b = Codec.STRING.xmap(bot::new, bot::a);
   public static final String c = "Lock";

   public boolean a(csd $$0) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         ws $$1 = $$0.a(jz.d);
         return $$1 != null && this.d.equals($$1.getString());
      }
   }

   public void a(ty $$0) {
      if (!this.d.isEmpty()) {
         $$0.a("Lock", this.d);
      }
   }

   public static bot b(ty $$0) {
      return $$0.b("Lock", 8) ? new bot($$0.l("Lock")) : a;
   }

   public String a() {
      return this.d;
   }
}
