import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dox implements dqs {
   public static final Codec<dox> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dgb.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dgb.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dgb.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dgb.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dmr.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dox::new)
   );
   public final dgb b;
   public final dgb c;
   public final dgb d;
   public final dgb e;
   public final dmr f;
   public final boolean g;

   public dox(dgb $$0, dgb $$1, dgb $$2, dgb $$3, dmr $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
