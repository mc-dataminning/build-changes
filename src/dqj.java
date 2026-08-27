import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqj implements dse {
   public static final Codec<dqj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dhn.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dhn.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dhn.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dhn.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dod.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dqj::new)
   );
   public final dhn b;
   public final dhn c;
   public final dhn d;
   public final dhn e;
   public final dod f;
   public final boolean g;

   public dqj(dhn $$0, dhn $$1, dhn $$2, dhn $$3, dod $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
