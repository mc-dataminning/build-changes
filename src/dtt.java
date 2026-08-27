import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtt implements dtr {
   public static final Codec<dtt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvs.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               dvs.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dtt::new)
   );
   public final dvs b;
   public final dvs c;
   public final int d;

   public dtt(dvs $$0, dvs $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
