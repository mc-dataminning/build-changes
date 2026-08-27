import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnw implements dpr {
   public static final Codec<dnw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfa.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dfa.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dfa.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dfa.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dlq.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dnw::new)
   );
   public final dfa b;
   public final dfa c;
   public final dfa d;
   public final dfa e;
   public final dlq f;
   public final boolean g;

   public dnw(dfa $$0, dfa $$1, dfa $$2, dfa $$3, dlq $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
