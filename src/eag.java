import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eag implements ecb {
   public static final Codec<eag> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drb.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               drb.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               drb.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               drb.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dya.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eag::new)
   );
   public final drb b;
   public final drb c;
   public final drb d;
   public final drb e;
   public final dya f;
   public final boolean g;

   public eag(drb $$0, drb $$1, drb $$2, drb $$3, dya $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
