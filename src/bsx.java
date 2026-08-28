import com.mojang.serialization.Codec;

public enum bsx implements azu {
   a("hurt", avz.uL),
   b("thorns", avz.Al),
   c("drowning", avz.uM),
   d("burning", avz.uO),
   e("poking", avz.uP),
   f("freezing", avz.uN);

   public static final Codec<bsx> g = azu.a(bsx::values);
   private final String h;
   private final avy i;

   private bsx(final String $$0, final avy $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public avy a() {
      return this.i;
   }
}
