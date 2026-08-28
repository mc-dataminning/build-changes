import com.mojang.serialization.Codec;

public enum bri implements azk {
   a("hurt", avp.ul),
   b("thorns", avp.zx),
   c("drowning", avp.um),
   d("burning", avp.uo),
   e("poking", avp.up),
   f("freezing", avp.un);

   public static final Codec<bri> g = azk.a(bri::values);
   private final String h;
   private final avo i;

   private bri(final String $$0, final avo $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public avo a() {
      return this.i;
   }
}
