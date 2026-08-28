import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eme implements emc {
   public static final Codec<eme> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eod.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               eod.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eme::new)
   );
   public final eod b;
   public final eod c;
   public final int d;

   public eme(eod $$0, eod $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
