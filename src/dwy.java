import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwy extends dse {
   public static final MapCodec<dwy> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               azg.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), lz.bk.fieldOf("leaf_particle").forGetter($$0x -> $$0x.g), t()
            )
            .apply($$0, dwy::new)
   );
   protected final lx g;

   public dwy(float $$0, lx $$1, ebp.d $$2) {
      super($$0, $$2);
      this.g = $$1;
   }

   @Override
   protected void a(dkj $$0, iw $$1, bai $$2) {
      bad.a($$0, $$1, $$2, this.g);
   }

   @Override
   public MapCodec<dwy> a() {
      return f;
   }
}
