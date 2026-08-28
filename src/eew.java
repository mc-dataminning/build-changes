import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eew extends efa {
   private final ju<eto> e;
   public static final MapCodec<eew> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kf.a(mb.D).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, eew::new)
   );

   public eew(kl $$0, ju<eto> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dxn $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public eeq<?> a() {
      return eeq.c;
   }
}
