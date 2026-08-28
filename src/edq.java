import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edq implements edo {
   public static final Codec<edq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efp.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               efp.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edq::new)
   );
   public final efp b;
   public final efp c;
   public final int d;

   public edq(efp $$0, efp $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
