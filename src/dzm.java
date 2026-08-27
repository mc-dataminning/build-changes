import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzm implements ebh {
   public static final Codec<dzm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dqh.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dqh.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dqh.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dqh.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dxg.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dzm::new)
   );
   public final dqh b;
   public final dqh c;
   public final dqh d;
   public final dqh e;
   public final dxg f;
   public final boolean g;

   public dzm(dqh $$0, dqh $$1, dqh $$2, dqh $$3, dxg $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
