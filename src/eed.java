import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eed implements efy {
   public static final Codec<eed> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dus.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dus.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dus.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dus.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               ebv.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eed::new)
   );
   public final dus b;
   public final dus c;
   public final dus d;
   public final dus e;
   public final ebv f;
   public final boolean g;

   public eed(dus $$0, dus $$1, dus $$2, dus $$3, ebv $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
