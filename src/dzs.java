import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzs extends dzx {
   private final jn<dfh> e;
   public static final MapCodec<dzs> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jy.a(lr.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dzs::new)
   );

   public dzs(ke $$0, jn<dfh> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dsk $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dzn<?> a() {
      return dzn.a;
   }
}
