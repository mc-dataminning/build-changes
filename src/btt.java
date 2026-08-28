import com.mojang.serialization.Codec;

public enum btt implements bba {
   a("hurt", axf.uE),
   b("thorns", axf.zV),
   c("drowning", axf.uF),
   d("burning", axf.uH),
   e("poking", axf.uI),
   f("freezing", axf.uG);

   public static final Codec<btt> g = bba.a(btt::values);
   private final String h;
   private final axe i;

   private btt(final String $$0, final axe $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public axe a() {
      return this.i;
   }
}
