import com.mojang.serialization.Codec;

public enum bje implements aub {
   a("hurt", aqn.sD),
   b("thorns", aqn.xO),
   c("drowning", aqn.sE),
   d("burning", aqn.sG),
   e("poking", aqn.sH),
   f("freezing", aqn.sF);

   public static final Codec<bje> g = aub.a(bje::values);
   private final String h;
   private final aqm i;

   private bje(String $$0, aqm $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public aqm a() {
      return this.i;
   }
}
