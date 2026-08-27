import com.mojang.serialization.Codec;

public enum bph implements ayq {
   a("hurt", auz.tW),
   b("thorns", auz.zi),
   c("drowning", auz.tX),
   d("burning", auz.tZ),
   e("poking", auz.ua),
   f("freezing", auz.tY);

   public static final Codec<bph> g = ayq.a(bph::values);
   private final String h;
   private final auy i;

   private bph(String $$0, auy $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public auy a() {
      return this.i;
   }
}
