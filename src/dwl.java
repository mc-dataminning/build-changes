import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwl extends dse {
   public static final MapCodec<dwl> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(azg.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), t()).apply($$0, dwl::new)
   );

   public dwl(float $$0, ebp.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(dkj $$0, iw $$1, bai $$2) {
      ls $$3 = ls.a(lz.J, $$0.s($$1));
      bad.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<? extends dwl> a() {
      return g;
   }
}
