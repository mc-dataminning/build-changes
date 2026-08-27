import com.mojang.serialization.Codec;

public enum bjm implements aug {
   a("hurt", aqr.sT),
   b("thorns", aqr.yf),
   c("drowning", aqr.sU),
   d("burning", aqr.sW),
   e("poking", aqr.sX),
   f("freezing", aqr.sV);

   public static final Codec<bjm> g = aug.a(bjm::values);
   private final String h;
   private final aqq i;

   private bjm(String $$0, aqq $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public aqq a() {
      return this.i;
   }
}
