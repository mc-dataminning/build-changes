import com.mojang.serialization.Codec;

public enum btp implements baq {
   a("hurt", awv.uL),
   b("thorns", awv.Am),
   c("drowning", awv.uM),
   d("burning", awv.uO),
   e("poking", awv.uP),
   f("freezing", awv.uN);

   public static final Codec<btp> g = baq.a(btp::values);
   private final String h;
   private final awu i;

   private btp(final String $$0, final awu $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public awu a() {
      return this.i;
   }
}
