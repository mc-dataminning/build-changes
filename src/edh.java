import com.mojang.serialization.Codec;

public class edh extends ecz {
   public static final Codec<edh> a = asv.a(ke.f).fieldOf("tag").xmap(edh::new, $$0 -> $$0.b).codec();
   private final asv<cwp> b;

   public edh(asv<cwp> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(djg $$0, auu $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eda<?> a() {
      return eda.d;
   }
}
