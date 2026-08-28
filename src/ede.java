import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ede implements edc {
   public static final Codec<ede> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efd.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               efd.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ede::new)
   );
   public final efd b;
   public final efd c;
   public final int d;

   public ede(efd $$0, efd $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
