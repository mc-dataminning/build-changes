import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elk implements eli {
   public static final Codec<elk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               enj.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               enj.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, elk::new)
   );
   public final enj b;
   public final enj c;
   public final int d;

   public elk(enj $$0, enj $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
