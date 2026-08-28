import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eja implements eiy {
   public static final Codec<eja> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekz.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               ekz.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eja::new)
   );
   public final ekz b;
   public final ekz c;
   public final int d;

   public eja(ekz $$0, ekz $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
