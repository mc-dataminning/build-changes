import com.mojang.serialization.Codec;

public enum bhm implements asp {
   a("hurt", apd.sz),
   b("thorns", apd.xK),
   c("drowning", apd.sA),
   d("burning", apd.sC),
   e("poking", apd.sD),
   f("freezing", apd.sB);

   public static final Codec<bhm> g = asp.a(bhm::values);
   private final String h;
   private final apc i;

   private bhm(String $$0, apc $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public apc a() {
      return this.i;
   }
}
