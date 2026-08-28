import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebg implements edb {
   public static final Codec<ebg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsb.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dsb.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dsb.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dsb.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dza.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ebg::new)
   );
   public final dsb b;
   public final dsb c;
   public final dsb d;
   public final dsb e;
   public final dza f;
   public final boolean g;

   public ebg(dsb $$0, dsb $$1, dsb $$2, dsb $$3, dza $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
