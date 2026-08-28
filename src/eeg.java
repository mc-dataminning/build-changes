import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeg implements eee {
   public static final Codec<eeg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egf.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               egf.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eeg::new)
   );
   public final egf b;
   public final egf c;
   public final int d;

   public eeg(egf $$0, egf $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
