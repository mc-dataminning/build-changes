import com.mojang.serialization.Codec;

public enum brz implements azy {
   a("hurt", awd.um),
   b("thorns", awd.zD),
   c("drowning", awd.un),
   d("burning", awd.up),
   e("poking", awd.uq),
   f("freezing", awd.uo);

   public static final Codec<brz> g = azy.a(brz::values);
   private final String h;
   private final awc i;

   private brz(final String $$0, final awc $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public awc a() {
      return this.i;
   }
}
