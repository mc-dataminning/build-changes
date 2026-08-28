import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtc extends drl implements dsw {
   public static final MapCodec<dtc> J = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsw.a.e.fieldOf("weathering_state").forGetter(dko::c), dwx.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, dtc::new)
   );
   private final dsw.a K;

   @Override
   public MapCodec<dtc> a() {
      return J;
   }

   public dtc(dsw.a $$0, dwx $$1, dww.d $$2) {
      super($$1, $$2);
      this.K = $$0;
   }

   @Override
   protected void b(dwx $$0, ard $$1, ji $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dwx $$0) {
      return dsw.c($$0.b()).isPresent();
   }

   public dsw.a q() {
      return this.K;
   }
}
