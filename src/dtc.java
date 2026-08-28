import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtc extends dqv implements dsx {
   public static final MapCodec<dtc> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsx.a.e.fieldOf("weathering_state").forGetter(dkp::c), t()).apply($$0, dtc::new)
   );
   private final dsx.a g;

   @Override
   public MapCodec<dtc> a() {
      return f;
   }

   public dtc(dsx.a $$0, dwx.d $$1) {
      super($$1);
      this.g = $$0;
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
      return this.g;
   }
}
