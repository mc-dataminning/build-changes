import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqe implements dqc {
   public static final Codec<dqe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsd.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               dsd.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dqe::new)
   );
   public final dsd b;
   public final dsd c;
   public final int d;

   public dqe(dsd $$0, dsd $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
