import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebu implements edp {
   public static final Codec<ebu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsl.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dsl.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dsl.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dsl.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dzn.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ebu::new)
   );
   public final dsl b;
   public final dsl c;
   public final dsl d;
   public final dsl e;
   public final dzn f;
   public final boolean g;

   public ebu(dsl $$0, dsl $$1, dsl $$2, dsl $$3, dzn $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
