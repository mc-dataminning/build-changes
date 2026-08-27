import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dub implements dvw {
   public static final Codec<dub> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dlf.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dlf.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dlf.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dlf.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               drv.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dub::new)
   );
   public final dlf b;
   public final dlf c;
   public final dlf d;
   public final dlf e;
   public final drv f;
   public final boolean g;

   public dub(dlf $$0, dlf $$1, dlf $$2, dlf $$3, drv $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
