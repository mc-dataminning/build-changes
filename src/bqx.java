import com.mojang.serialization.Codec;

public enum bqx implements azc {
   a("hurt", avh.ul),
   b("thorns", avh.zx),
   c("drowning", avh.um),
   d("burning", avh.uo),
   e("poking", avh.up),
   f("freezing", avh.un);

   public static final Codec<bqx> g = azc.a(bqx::values);
   private final String h;
   private final avg i;

   private bqx(final String $$0, final avg $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public avg a() {
      return this.i;
   }
}
