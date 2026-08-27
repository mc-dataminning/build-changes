import com.mojang.serialization.Codec;

public enum bhm implements asp {
   a("hurt", ape.sz),
   b("thorns", ape.xK),
   c("drowning", ape.sA),
   d("burning", ape.sC),
   e("poking", ape.sD),
   f("freezing", ape.sB);

   public static final Codec<bhm> g = asp.a(bhm::values);
   private final String h;
   private final apd i;

   private bhm(String $$0, apd $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public apd a() {
      return this.i;
   }
}
