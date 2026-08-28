import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dul extends dqi {
   public static final MapCodec<dul> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ays.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), t()).apply($$0, dul::new)
   );

   public dul(float $$0, dzn.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(dip $$0, iu $$1, azt $$2) {
      lq $$3 = lq.a(lx.J, $$0.s($$1));
      azo.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<? extends dul> a() {
      return g;
   }
}
