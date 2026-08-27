import com.mojang.serialization.Codec;

public enum bnc implements axg {
   a("hurt", atp.tE),
   b("thorns", atp.yQ),
   c("drowning", atp.tF),
   d("burning", atp.tH),
   e("poking", atp.tI),
   f("freezing", atp.tG);

   public static final Codec<bnc> g = axg.a(bnc::values);
   private final String h;
   private final ato i;

   private bnc(String $$0, ato $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public ato a() {
      return this.i;
   }
}
