import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejc implements eja {
   public static final Codec<ejc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               elb.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               elb.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ejc::new)
   );
   public final elb b;
   public final elb c;
   public final int d;

   public ejc(elb $$0, elb $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
