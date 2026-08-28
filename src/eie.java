import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eie implements eic {
   public static final Codec<eie> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekd.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               ekd.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eie::new)
   );
   public final ekd b;
   public final ekd c;
   public final int d;

   public eie(ekd $$0, ekd $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
