import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eig extends eik {
   private final jj<ewz> e;
   public static final MapCodec<eig> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ju.a(mh.F).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, eig::new)
   );

   public eig(ka $$0, jj<ewz> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(eat $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public eia<?> a() {
      return eia.c;
   }
}
