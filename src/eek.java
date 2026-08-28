import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eek implements eei {
   public static final Codec<eek> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egj.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               egj.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eek::new)
   );
   public final egj b;
   public final egj c;
   public final int d;

   public eek(egj $$0, egj $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
