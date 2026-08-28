import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwb extends dru {
   public static final MapCodec<dwb> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayy.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), t()).apply($$0, dwb::new)
   );

   public dwb(float $$0, ebf.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(djz $$0, iw $$1, azz $$2) {
      ls $$3 = ls.a(lz.J, $$0.s($$1));
      azu.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<? extends dwb> a() {
      return g;
   }
}
