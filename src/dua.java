import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dua extends dsj implements dtu {
   public static final MapCodec<dua> J = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtu.a.e.fieldOf("weathering_state").forGetter(dlo::c), dxv.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, dua::new)
   );
   private final dtu.a K;

   @Override
   public MapCodec<dua> a() {
      return J;
   }

   public dua(dtu.a $$0, dxv $$1, dxu.d $$2) {
      super($$1, $$2);
      this.K = $$0;
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dxv $$0) {
      return dtu.c($$0.b()).isPresent();
   }

   public dtu.a q() {
      return this.K;
   }
}
