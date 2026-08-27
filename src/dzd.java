import com.mojang.serialization.Codec;

public class dzd extends dyv {
   public static final Codec<dzd> a = aqh.a(jc.e).fieldOf("tag").xmap(dzd::new, $$0 -> $$0.b).codec();
   private final aqh<csv> b;

   public dzd(aqh<csv> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dfj $$0, asc $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected dyw<?> a() {
      return dyw.d;
   }
}
