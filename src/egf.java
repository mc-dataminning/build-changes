import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egf implements eia {
   public static final Codec<egf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwv.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dwv.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dwv.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dwv.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               edx.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, egf::new)
   );
   public final dwv b;
   public final dwv c;
   public final dwv d;
   public final dwv e;
   public final edx f;
   public final boolean g;

   public egf(dwv $$0, dwv $$1, dwv $$2, dwv $$3, edx $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
