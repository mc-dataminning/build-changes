import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecf implements ecd {
   public static final Codec<ecf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eee.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               eee.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ecf::new)
   );
   public final eee b;
   public final eee c;
   public final int d;

   public ecf(eee $$0, eee $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
