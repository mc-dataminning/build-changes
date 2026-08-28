import com.mojang.serialization.Codec;

public enum bsz implements azv {
   a("hurt", awa.uL),
   b("thorns", awa.Al),
   c("drowning", awa.uM),
   d("burning", awa.uO),
   e("poking", awa.uP),
   f("freezing", awa.uN);

   public static final Codec<bsz> g = azv.a(bsz::values);
   private final String h;
   private final avz i;

   private bsz(final String $$0, final avz $$1) {
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
