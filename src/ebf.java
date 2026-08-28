import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebf implements eda {
   public static final Codec<ebf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsa.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dsa.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dsa.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dsa.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dyz.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ebf::new)
   );
   public final dsa b;
   public final dsa c;
   public final dsa d;
   public final dsa e;
   public final dyz f;
   public final boolean g;

   public ebf(dsa $$0, dsa $$1, dsa $$2, dsa $$3, dyz $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
