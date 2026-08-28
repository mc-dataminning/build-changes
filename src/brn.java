import com.mojang.serialization.Codec;

public enum brn implements azu {
   a("hurt", awa.ui),
   b("thorns", awa.zu),
   c("drowning", awa.uj),
   d("burning", awa.ul),
   e("poking", awa.um),
   f("freezing", awa.uk);

   public static final Codec<brn> g = azu.a(brn::values);
   private final String h;
   private final avz i;

   private brn(final String $$0, final avz $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public avz a() {
      return this.i;
   }
}
