import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwb extends drh {
   public static final MapCodec<dwb> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ayu.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), ly.bk.fieldOf("leaf_particle").forGetter($$0x -> $$0x.g), t()
            )
            .apply($$0, dwb::new)
   );
   protected final lw g;

   public dwb(float $$0, lw $$1, eas.d $$2) {
      super($$0, $$2);
      this.g = $$1;
   }

   @Override
   protected void a(djm $$0, iv $$1, azv $$2) {
      azq.a($$0, $$1, $$2, this.g);
   }

   @Override
   public MapCodec<dwb> a() {
      return f;
   }
}
