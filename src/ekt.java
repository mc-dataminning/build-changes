import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekt implements emp {
   public static final Codec<ekt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebe.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               ebe.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               ebe.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               ebe.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               eik.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ekt::new)
   );
   public final ebe b;
   public final ebe c;
   public final ebe d;
   public final ebe e;
   public final eik f;
   public final boolean g;

   public ekt(ebe $$0, ebe $$1, ebe $$2, ebe $$3, eik $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
