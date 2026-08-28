import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejb implements eiz {
   public static final Codec<ejb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ela.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               ela.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ejb::new)
   );
   public final ela b;
   public final ela c;
   public final int d;

   public ejb(ela $$0, ela $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
