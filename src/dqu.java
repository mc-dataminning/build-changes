import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqu implements dqs {
   public static final Codec<dqu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dst.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               dst.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dqu::new)
   );
   public final dst b;
   public final dst c;
   public final int d;

   public dqu(dst $$0, dst $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
