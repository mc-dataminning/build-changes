import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dof implements dqa {
   public static final Codec<dof> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfj.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dfj.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dfj.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dfj.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dlz.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dof::new)
   );
   public final dfj b;
   public final dfj c;
   public final dfj d;
   public final dfj e;
   public final dlz f;
   public final boolean g;

   public dof(dfj $$0, dfj $$1, dfj $$2, dfj $$3, dlz $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
