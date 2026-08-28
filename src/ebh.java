import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebh implements edc {
   public static final Codec<ebh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsc.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dsc.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dsc.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dsc.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dzb.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ebh::new)
   );
   public final dsc b;
   public final dsc c;
   public final dsc d;
   public final dsc e;
   public final dzb f;
   public final boolean g;

   public ebh(dsc $$0, dsc $$1, dsc $$2, dsc $$3, dzb $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
