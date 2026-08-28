import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class efy extends egd {
   private final jw<dku> e;
   public static final MapCodec<efy> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kh.a(me.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, efy::new)
   );

   public efy(kn $$0, jw<dku> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dym $$0) {
      return $$0.a(this.e);
   }

   @Override
   public eft<?> a() {
      return eft.a;
   }
}
