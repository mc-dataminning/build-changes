import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class end implements enb {
   public static final Codec<end> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               epc.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               epc.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, end::new)
   );
   public final epc b;
   public final epc c;
   public final int d;

   public end(epc $$0, epc $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
