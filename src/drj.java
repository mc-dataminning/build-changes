import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drj extends dps implements drd {
   public static final MapCodec<drj> J = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drd.a.e.fieldOf("weathering_state").forGetter(diz::c), dvd.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, drj::new)
   );
   private final drd.a K;

   @Override
   public MapCodec<drj> a() {
      return J;
   }

   public drj(drd.a $$0, dvd $$1, dvc.d $$2) {
      super($$1, $$2);
      this.K = $$0;
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dvd $$0) {
      return drd.c($$0.b()).isPresent();
   }

   public drd.a q() {
      return this.K;
   }
}
