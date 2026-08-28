import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebi implements edd {
   public static final Codec<ebi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsd.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dsd.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dsd.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dsd.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dzc.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ebi::new)
   );
   public final dsd b;
   public final dsd c;
   public final dsd d;
   public final dsd e;
   public final dzc f;
   public final boolean g;

   public ebi(dsd $$0, dsd $$1, dsd $$2, dsd $$3, dzc $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
