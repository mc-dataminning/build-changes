import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eia extends eif {
   private final jj<dmm> e;
   public static final MapCodec<eia> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ju.a(mh.i).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, eia::new)
   );

   public eia(ka $$0, jj<dmm> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(eao $$0) {
      return $$0.a(this.e);
   }

   @Override
   public ehv<?> a() {
      return ehv.a;
   }
}
