import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eej implements eeh {
   public static final Codec<eej> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egi.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               egi.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eej::new)
   );
   public final egi b;
   public final egi c;
   public final int d;

   public eej(egi $$0, egi $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
