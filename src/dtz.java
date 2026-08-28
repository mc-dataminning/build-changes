import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtz extends drs implements dtu {
   public static final MapCodec<dtz> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtu.a.e.fieldOf("weathering_state").forGetter(dlo::c), t()).apply($$0, dtz::new)
   );
   private final dtu.a g;

   @Override
   public MapCodec<dtz> a() {
      return f;
   }

   public dtz(dtu.a $$0, dxu.d $$1) {
      super($$1);
      this.g = $$0;
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
      return this.g;
   }
}
