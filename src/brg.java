import com.mojang.serialization.Codec;

public enum brg implements azp {
   a("hurt", avw.ui),
   b("thorns", avw.zu),
   c("drowning", avw.uj),
   d("burning", avw.ul),
   e("poking", avw.um),
   f("freezing", avw.uk);

   public static final Codec<brg> g = azp.a(brg::values);
   private final String h;
   private final avv i;

   private brg(final String $$0, final avv $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public avv a() {
      return this.i;
   }
}
