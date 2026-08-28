import com.mojang.serialization.Codec;

public enum bsw implements baj {
   a("hurt", awo.uk),
   b("thorns", awo.zB),
   c("drowning", awo.ul),
   d("burning", awo.un),
   e("poking", awo.uo),
   f("freezing", awo.um);

   public static final Codec<bsw> g = baj.a(bsw::values);
   private final String h;
   private final awn i;

   private bsw(final String $$0, final awn $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public awn a() {
      return this.i;
   }
}
