import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dty extends dtt implements dtu {
   public static final MapCodec<dty> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtu.a.e.fieldOf("weathering_state").forGetter(dty::q), t()).apply($$0, dty::new)
   );
   private final dtu.a f;

   @Override
   protected MapCodec<dty> a() {
      return e;
   }

   protected dty(dtu.a $$0, dxu.d $$1) {
      super($$1);
      this.f = $$0;
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
      return this.f;
   }
}
