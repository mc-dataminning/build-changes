import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drp extends dpy implements drj {
   public static final MapCodec<drp> J = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drj.a.e.fieldOf("weathering_state").forGetter(djf::c), dvj.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, drp::new)
   );
   private final drj.a K;

   @Override
   public MapCodec<drp> a() {
      return J;
   }

   public drp(drj.a $$0, dvj $$1, dvi.d $$2) {
      super($$1, $$2);
      this.K = $$0;
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
      return this.K;
   }
}
