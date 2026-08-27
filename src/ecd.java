import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecd implements ecb {
   public static final Codec<ecd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eec.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               eec.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ecd::new)
   );
   public final eec b;
   public final eec c;
   public final int d;

   public ecd(eec $$0, eec $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
