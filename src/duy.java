import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duy extends dqi {
   public static final MapCodec<duy> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ays.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), lx.bj.fieldOf("leaf_particle").forGetter($$0x -> $$0x.g), t()
            )
            .apply($$0, duy::new)
   );
   protected final lv g;

   public duy(float $$0, lv $$1, dzn.d $$2) {
      super($$0, $$2);
      this.g = $$1;
   }

   @Override
   protected void a(dip $$0, iu $$1, azt $$2) {
      azo.a($$0, $$1, $$2, this.g);
   }

   @Override
   public MapCodec<duy> a() {
      return f;
   }
}
