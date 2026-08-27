import com.mojang.serialization.Codec;

public enum bor implements aye {
   a("hurt", aum.tP),
   b("thorns", aum.zb),
   c("drowning", aum.tQ),
   d("burning", aum.tS),
   e("poking", aum.tT),
   f("freezing", aum.tR);

   public static final Codec<bor> g = aye.a(bor::values);
   private final String h;
   private final aul i;

   private bor(String $$0, aul $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public aul a() {
      return this.i;
   }
}
