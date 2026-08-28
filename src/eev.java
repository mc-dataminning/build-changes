import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eev extends efa {
   private final ju<dke> e;
   public static final MapCodec<eev> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kf.a(mb.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, eev::new)
   );

   public eev(kl $$0, ju<dke> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dxn $$0) {
      return $$0.a(this.e);
   }

   @Override
   public eeq<?> a() {
      return eeq.a;
   }
}
