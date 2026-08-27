import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpt implements dpr {
   public static final Codec<dpt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drs.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               drs.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dpt::new)
   );
   public final drs b;
   public final drs c;
   public final int d;

   public dpt(drs $$0, drs $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
