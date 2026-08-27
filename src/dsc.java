import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsc implements dtx {
   public static final Codec<dsc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               djg.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               djg.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               djg.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               djg.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dpw.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dsc::new)
   );
   public final djg b;
   public final djg c;
   public final djg d;
   public final djg e;
   public final dpw f;
   public final boolean g;

   public dsc(djg $$0, djg $$1, djg $$2, djg $$3, dpw $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
