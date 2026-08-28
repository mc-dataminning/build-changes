import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeu implements egp {
   public static final Codec<eeu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvj.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dvj.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dvj.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dvj.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               ecm.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eeu::new)
   );
   public final dvj b;
   public final dvj c;
   public final dvj d;
   public final dvj e;
   public final ecm f;
   public final boolean g;

   public eeu(dvj $$0, dvj $$1, dvj $$2, dvj $$3, ecm $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
