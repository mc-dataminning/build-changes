import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvw extends drc {
   public static final MapCodec<dvw> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ayu.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), ly.bk.fieldOf("leaf_particle").forGetter($$0x -> $$0x.g), t()
            )
            .apply($$0, dvw::new)
   );
   protected final lw g;

   public dvw(float $$0, lw $$1, ean.d $$2) {
      super($$0, $$2);
      this.g = $$1;
   }

   @Override
   protected void a(djh $$0, iv $$1, azv $$2) {
      azq.a($$0, $$1, $$2, this.g);
   }

   @Override
   public MapCodec<dvw> a() {
      return f;
   }
}
