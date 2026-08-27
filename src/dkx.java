import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkx implements dms {
   public static final Codec<dkx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dcb.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dcb.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dcb.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dcb.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dir.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dkx::new)
   );
   public final dcb b;
   public final dcb c;
   public final dcb d;
   public final dcb e;
   public final dir f;
   public final boolean g;

   public dkx(dcb $$0, dcb $$1, dcb $$2, dcb $$3, dir $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
