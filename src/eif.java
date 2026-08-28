import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eif extends eik {
   private final jj<dmr> e;
   public static final MapCodec<eif> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ju.a(mh.i).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, eif::new)
   );

   public eif(ka $$0, jj<dmr> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(eat $$0) {
      return $$0.a(this.e);
   }

   @Override
   public eia<?> a() {
      return eia.a;
   }
}
