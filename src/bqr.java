import com.mojang.serialization.Codec;

public enum bqr implements azg {
   a("hurt", avo.uG),
   b("thorns", avo.zS),
   c("drowning", avo.uH),
   d("burning", avo.uJ),
   e("poking", avo.uK),
   f("freezing", avo.uI);

   public static final Codec<bqr> g = azg.a(bqr::values);
   private final String h;
   private final avn i;

   private bqr(String $$0, avn $$1) {
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
