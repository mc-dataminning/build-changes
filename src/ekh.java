import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekh implements emc {
   public static final Codec<ekh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eat.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               eat.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               eat.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               eat.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               ehz.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ekh::new)
   );
   public final eat b;
   public final eat c;
   public final eat d;
   public final eat e;
   public final ehz f;
   public final boolean g;

   public ekh(eat $$0, eat $$1, eat $$2, eat $$3, ehz $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
