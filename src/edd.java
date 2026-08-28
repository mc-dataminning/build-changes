import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edd implements edb {
   public static final Codec<edd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efc.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               efc.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edd::new)
   );
   public final efc b;
   public final efc c;
   public final int d;

   public edd(efc $$0, efc $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
