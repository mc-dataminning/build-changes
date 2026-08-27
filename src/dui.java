import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dui implements dwd {
   public static final Codec<dui> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dlj.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dlj.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dlj.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dlj.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dsc.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dui::new)
   );
   public final dlj b;
   public final dlj c;
   public final dlj d;
   public final dlj e;
   public final dsc f;
   public final boolean g;

   public dui(dlj $$0, dlj $$1, dlj $$2, dlj $$3, dsc $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
