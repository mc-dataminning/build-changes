import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eia implements ejv {
   public static final Codec<eia> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dym.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dym.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dym.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dym.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               efs.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eia::new)
   );
   public final dym b;
   public final dym c;
   public final dym d;
   public final dym e;
   public final efs f;
   public final boolean g;

   public eia(dym $$0, dym $$1, dym $$2, dym $$3, efs $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
