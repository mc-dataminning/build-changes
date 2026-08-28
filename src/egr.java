import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egr implements egp {
   public static final Codec<egr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eiq.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               eiq.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, egr::new)
   );
   public final eiq b;
   public final eiq c;
   public final int d;

   public egr(eiq $$0, eiq $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
