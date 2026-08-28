import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eib extends eif {
   private final jj<ewu> e;
   public static final MapCodec<eib> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ju.a(mh.F).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, eib::new)
   );

   public eib(ka $$0, jj<ewu> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(eao $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public ehv<?> a() {
      return ehv.c;
   }
}
