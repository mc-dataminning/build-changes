import com.mojang.serialization.Codec;

public enum bip implements atr {
   a("hurt", aqd.sB),
   b("thorns", aqd.xM),
   c("drowning", aqd.sC),
   d("burning", aqd.sE),
   e("poking", aqd.sF),
   f("freezing", aqd.sD);

   public static final Codec<bip> g = atr.a(bip::values);
   private final String h;
   private final aqc i;

   private bip(String $$0, aqc $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public aqc a() {
      return this.i;
   }
}
