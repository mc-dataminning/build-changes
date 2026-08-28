import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejc implements ekx {
   public static final Codec<ejc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzo.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dzo.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dzo.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dzo.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               egu.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ejc::new)
   );
   public final dzo b;
   public final dzo c;
   public final dzo d;
   public final dzo e;
   public final egu f;
   public final boolean g;

   public ejc(dzo $$0, dzo $$1, dzo $$2, dzo $$3, egu $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
