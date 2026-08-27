import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwf implements dwd {
   public static final Codec<dwf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dye.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               dye.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dwf::new)
   );
   public final dye b;
   public final dye c;
   public final int d;

   public dwf(dye $$0, dye $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
