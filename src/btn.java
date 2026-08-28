import com.mojang.serialization.Codec;

public enum btn implements azv {
   a("hurt", awa.uV),
   b("thorns", awa.uV),
   c("drowning", awa.uW),
   d("burning", awa.uY),
   e("poking", awa.uZ),
   f("freezing", awa.uX);

   public static final Codec<btn> g = azv.a(btn::values);
   private final String h;
   private final avz i;

   private btn(final String $$0, final avz $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public avz a() {
      return this.i;
   }
}
