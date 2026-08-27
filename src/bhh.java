import com.mojang.serialization.Codec;

public enum bhh implements ask {
   a("hurt", aoz.sz),
   b("thorns", aoz.xK),
   c("drowning", aoz.sA),
   d("burning", aoz.sC),
   e("poking", aoz.sD),
   f("freezing", aoz.sB);

   public static final Codec<bhh> g = ask.a(bhh::values);
   private final String h;
   private final aoy i;

   private bhh(String $$0, aoy $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public aoy a() {
      return this.i;
   }
}
