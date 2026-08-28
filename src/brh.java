import com.mojang.serialization.Codec;

public enum brh implements azj {
   a("hurt", avo.ul),
   b("thorns", avo.zx),
   c("drowning", avo.um),
   d("burning", avo.uo),
   e("poking", avo.up),
   f("freezing", avo.un);

   public static final Codec<brh> g = azj.a(brh::values);
   private final String h;
   private final avn i;

   private brh(final String $$0, final avn $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public avn a() {
      return this.i;
   }
}
