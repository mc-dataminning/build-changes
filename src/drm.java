import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drm extends die implements drj {
   public static final MapCodec<drm> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drj.a.e.fieldOf("weathering_state").forGetter(djf::c), t()).apply($$0, drm::new)
   );
   private final drj.a e;

   @Override
   public MapCodec<drm> a() {
      return d;
   }

   public drm(drj.a $$0, dvi.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dvj $$0) {
      return drj.c($$0.b()).isPresent();
   }

   public drj.a q() {
      return this.e;
   }
}
