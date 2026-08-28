import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebc implements ecx {
   public static final Codec<ebc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drx.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               drx.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               drx.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               drx.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dyw.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ebc::new)
   );
   public final drx b;
   public final drx c;
   public final drx d;
   public final drx e;
   public final dyw f;
   public final boolean g;

   public ebc(drx $$0, drx $$1, drx $$2, drx $$3, dyw $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
