import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvj extends drc {
   public static final MapCodec<dvj> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), t()).apply($$0, dvj::new)
   );

   public dvj(float $$0, ean.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(djh $$0, iv $$1, azv $$2) {
      lr $$3 = lr.a(ly.J, $$0.s($$1));
      azq.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<? extends dvj> a() {
      return g;
   }
}
