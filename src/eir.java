import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eir extends eiv {
   private final jj<exn> e;
   public static final MapCodec<eir> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ju.a(mh.F).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, eir::new)
   );

   public eir(ka $$0, jj<exn> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(ebe $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public eil<?> a() {
      return eil.c;
   }
}
