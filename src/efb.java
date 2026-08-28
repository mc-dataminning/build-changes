import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class efb extends efg {
   private final jv<dke> e;
   public static final MapCodec<efb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kg.a(mc.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, efb::new)
   );

   public efb(km $$0, jv<dke> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dxq $$0) {
      return $$0.a(this.e);
   }

   @Override
   public eew<?> a() {
      return eew.a;
   }
}
