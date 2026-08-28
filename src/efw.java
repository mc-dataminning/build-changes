import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efw implements efu {
   public static final Codec<efw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehv.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               ehv.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, efw::new)
   );
   public final ehv b;
   public final ehv c;
   public final int d;

   public efw(ehv $$0, ehv $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
