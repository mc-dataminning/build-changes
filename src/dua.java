import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dua implements dty {
   public static final Codec<dua> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvz.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               dvz.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dua::new)
   );
   public final dvz b;
   public final dvz c;
   public final int d;

   public dua(dvz $$0, dvz $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
