import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egh implements eic {
   public static final Codec<egh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwx.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dwx.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dwx.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dwx.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               edz.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, egh::new)
   );
   public final dwx b;
   public final dwx c;
   public final dwx d;
   public final dwx e;
   public final edz f;
   public final boolean g;

   public egh(dwx $$0, dwx $$1, dwx $$2, dwx $$3, edz $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
