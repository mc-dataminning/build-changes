import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eiq extends eiv {
   private final jj<dnc> e;
   public static final MapCodec<eiq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ju.a(mh.i).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, eiq::new)
   );

   public eiq(ka $$0, jj<dnc> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(ebe $$0) {
      return $$0.a(this.e);
   }

   @Override
   public eil<?> a() {
      return eil.a;
   }
}
