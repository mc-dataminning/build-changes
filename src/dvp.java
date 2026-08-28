import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvp extends dqv {
   public static final MapCodec<dvp> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ayu.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), lx.bk.fieldOf("leaf_particle").forGetter($$0x -> $$0x.g), t()
            )
            .apply($$0, dvp::new)
   );
   protected final lv g;

   public dvp(float $$0, lv $$1, eag.d $$2) {
      super($$0, $$2);
      this.g = $$1;
   }

   @Override
   protected void a(dja $$0, iu $$1, azv $$2) {
      azq.a($$0, $$1, $$2, this.g);
   }

   @Override
   public MapCodec<dvp> a() {
      return f;
   }
}
