import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ede extends edi {
   private final ju<eru> e;
   public static final MapCodec<ede> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kf.a(ma.D).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, ede::new)
   );

   public ede(kl $$0, ju<eru> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dvv $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public ecy<?> a() {
      return ecy.c;
   }
}
