import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsd implements dty {
   public static final Codec<dsd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               djh.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               djh.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               djh.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               djh.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dpx.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dsd::new)
   );
   public final djh b;
   public final djh c;
   public final djh d;
   public final djh e;
   public final dpx f;
   public final boolean g;

   public dsd(djh $$0, djh $$1, djh $$2, djh $$3, dpx $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
