import com.mojang.serialization.Codec;

public enum bhc implements asf {
   a("hurt", aou.sz),
   b("thorns", aou.xF),
   c("drowning", aou.sA),
   d("burning", aou.sC),
   e("poking", aou.sD),
   f("freezing", aou.sB);

   public static final Codec<bhc> g = asf.a(bhc::values);
   private final String h;
   private final aot i;

   private bhc(String $$0, aot $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public aot a() {
      return this.i;
   }
}
