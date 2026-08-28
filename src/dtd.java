import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtd extends drm implements dsx {
   public static final MapCodec<dtd> J = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsx.a.e.fieldOf("weathering_state").forGetter(dkp::c), dwy.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, dtd::new)
   );
   private final dsx.a K;

   @Override
   public MapCodec<dtd> a() {
      return J;
   }

   public dtd(dsx.a $$0, dwy $$1, dwx.d $$2) {
      super($$1, $$2);
      this.K = $$0;
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dwy $$0) {
      return dsx.c($$0.b()).isPresent();
   }

   public dsx.a q() {
      return this.K;
   }
}
