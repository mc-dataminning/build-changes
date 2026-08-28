import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwo extends dru {
   public static final MapCodec<dwo> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ayy.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), lz.bk.fieldOf("leaf_particle").forGetter($$0x -> $$0x.g), t()
            )
            .apply($$0, dwo::new)
   );
   protected final lx g;

   public dwo(float $$0, lx $$1, ebf.d $$2) {
      super($$0, $$2);
      this.g = $$1;
   }

   @Override
   protected void a(djz $$0, iw $$1, azz $$2) {
      azu.a($$0, $$1, $$2, this.g);
   }

   @Override
   public MapCodec<dwo> a() {
      return f;
   }
}
