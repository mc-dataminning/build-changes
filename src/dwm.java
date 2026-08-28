import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwm extends drs {
   public static final MapCodec<dwm> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ayw.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), ly.bk.fieldOf("leaf_particle").forGetter($$0x -> $$0x.g), t()
            )
            .apply($$0, dwm::new)
   );
   protected final lw g;

   public dwm(float $$0, lw $$1, ebd.d $$2) {
      super($$0, $$2);
      this.g = $$1;
   }

   @Override
   protected void a(djx $$0, iv $$1, azx $$2) {
      azs.a($$0, $$1, $$2, this.g);
   }

   @Override
   public MapCodec<dwm> a() {
      return f;
   }
}
