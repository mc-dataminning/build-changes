import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsl implements dug {
   public static final Codec<dsl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               djp.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               djp.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               djp.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               djp.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dqf.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dsl::new)
   );
   public final djp b;
   public final djp c;
   public final djp d;
   public final djp e;
   public final dqf f;
   public final boolean g;

   public dsl(djp $$0, djp $$1, djp $$2, djp $$3, dqf $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
