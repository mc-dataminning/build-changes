import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emr implements emp {
   public static final Codec<emr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eoq.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               eoq.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, emr::new)
   );
   public final eoq b;
   public final eoq c;
   public final int d;

   public emr(eoq $$0, eoq $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
