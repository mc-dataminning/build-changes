import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class edd extends edi {
   private final ju<diq> e;
   public static final MapCodec<edd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kf.a(ma.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, edd::new)
   );

   public edd(kl $$0, ju<diq> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dvv $$0) {
      return $$0.a(this.e);
   }

   @Override
   public ecy<?> a() {
      return ecy.a;
   }
}
