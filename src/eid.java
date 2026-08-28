import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eid implements eib {
   public static final Codec<eid> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekc.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               ekc.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eid::new)
   );
   public final ekc b;
   public final ekc c;
   public final int d;

   public eid(ekc $$0, ekc $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
