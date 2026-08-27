import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmu implements dms {
   public static final Codec<dmu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dot.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               dot.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dmu::new)
   );
   public final dot b;
   public final dot c;
   public final int d;

   public dmu(dot $$0, dot $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
