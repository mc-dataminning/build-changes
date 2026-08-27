import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eak implements eai {
   public static final Codec<eak> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecj.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               ecj.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eak::new)
   );
   public final ecj b;
   public final ecj c;
   public final int d;

   public eak(ecj $$0, ecj $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
