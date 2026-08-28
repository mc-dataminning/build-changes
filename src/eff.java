import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eff implements eha {
   public static final Codec<eff> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvv.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dvv.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dvv.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dvv.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               ecx.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eff::new)
   );
   public final dvv b;
   public final dvv c;
   public final dvv d;
   public final dvv e;
   public final ecx f;
   public final boolean g;

   public eff(dvv $$0, dvv $$1, dvv $$2, dvv $$3, ecx $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
