import com.mojang.serialization.Codec;

public enum bsy implements azv {
   a("hurt", awa.uL),
   b("thorns", awa.Al),
   c("drowning", awa.uM),
   d("burning", awa.uO),
   e("poking", awa.uP),
   f("freezing", awa.uN);

   public static final Codec<bsy> g = azv.a(bsy::values);
   private final String h;
   private final avz i;

   private bsy(final String $$0, final avz $$1) {
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
