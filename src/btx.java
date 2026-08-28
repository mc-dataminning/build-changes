import com.mojang.serialization.Codec;

public enum btx implements bba {
   a("hurt", axf.uF),
   b("thorns", axf.zW),
   c("drowning", axf.uG),
   d("burning", axf.uI),
   e("poking", axf.uJ),
   f("freezing", axf.uH);

   public static final Codec<btx> g = bba.a(btx::values);
   private final String h;
   private final axe i;

   private btx(final String $$0, final axe $$1) {
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
