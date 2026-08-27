import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dye implements dzz {
   public static final Codec<dye> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               doz.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               doz.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               doz.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               doz.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dvy.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dye::new)
   );
   public final doz b;
   public final doz c;
   public final doz d;
   public final doz e;
   public final dvy f;
   public final boolean g;

   public dye(doz $$0, doz $$1, doz $$2, doz $$3, dvy $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
