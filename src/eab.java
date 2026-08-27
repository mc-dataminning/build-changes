import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eab implements dzz {
   public static final Codec<eab> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eca.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               eca.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eab::new)
   );
   public final eca b;
   public final eca c;
   public final int d;

   public eab(eca $$0, eca $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
