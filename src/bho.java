import com.mojang.serialization.Codec;

public enum bho implements asr {
   a("hurt", apf.sz),
   b("thorns", apf.xK),
   c("drowning", apf.sA),
   d("burning", apf.sC),
   e("poking", apf.sD),
   f("freezing", apf.sB);

   public static final Codec<bho> g = asr.a(bho::values);
   private final String h;
   private final ape i;

   private bho(String $$0, ape $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public ape a() {
      return this.i;
   }
}
