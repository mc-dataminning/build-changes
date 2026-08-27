import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnz implements dpu {
   public static final Codec<dnz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfd.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dfd.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dfd.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dfd.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dlt.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dnz::new)
   );
   public final dfd b;
   public final dfd c;
   public final dfd d;
   public final dfd e;
   public final dlt f;
   public final boolean g;

   public dnz(dfd $$0, dfd $$1, dfd $$2, dfd $$3, dlt $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
