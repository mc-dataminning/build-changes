import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnv implements dpq {
   public static final Codec<dnv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dez.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dez.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dez.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dez.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dlp.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dnv::new)
   );
   public final dez b;
   public final dez c;
   public final dez d;
   public final dez e;
   public final dlp f;
   public final boolean g;

   public dnv(dez $$0, dez $$1, dez $$2, dez $$3, dlp $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
