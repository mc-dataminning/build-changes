import com.mojang.serialization.Codec;

public enum bty implements bba {
   a("hurt", axf.uF),
   b("thorns", axf.zW),
   c("drowning", axf.uG),
   d("burning", axf.uI),
   e("poking", axf.uJ),
   f("freezing", axf.uH);

   public static final Codec<bty> g = bba.a(bty::values);
   private final String h;
   private final axe i;

   private bty(final String $$0, final axe $$1) {
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
