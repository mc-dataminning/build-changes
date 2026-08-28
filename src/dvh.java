import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvh extends dqp {
   public static final MapCodec<dvh> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ayu.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), lx.bk.fieldOf("leaf_particle").forGetter($$0x -> $$0x.g), t()
            )
            .apply($$0, dvh::new)
   );
   protected final lv g;

   public dvh(float $$0, lv $$1, dzy.d $$2) {
      super($$0, $$2);
      this.g = $$1;
   }

   @Override
   protected void a(div $$0, iu $$1, azv $$2) {
      azq.a($$0, $$1, $$2, this.g);
   }

   @Override
   public MapCodec<dvh> a() {
      return f;
   }
}
