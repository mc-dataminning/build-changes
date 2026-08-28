import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvz extends drs {
   public static final MapCodec<dvz> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayw.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), t()).apply($$0, dvz::new)
   );

   public dvz(float $$0, ebd.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(djx $$0, iv $$1, azx $$2) {
      lr $$3 = lr.a(ly.J, $$0.s($$1));
      azs.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<? extends dvz> a() {
      return g;
   }
}
