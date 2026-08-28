import com.mojang.serialization.Codec;

public enum bsh implements bab {
   a("hurt", awg.um),
   b("thorns", awg.zD),
   c("drowning", awg.un),
   d("burning", awg.up),
   e("poking", awg.uq),
   f("freezing", awg.uo);

   public static final Codec<bsh> g = bab.a(bsh::values);
   private final String h;
   private final awf i;

   private bsh(final String $$0, final awf $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public awf a() {
      return this.i;
   }
}
