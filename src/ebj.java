import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebj implements ebh {
   public static final Codec<ebj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edi.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               edi.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ebj::new)
   );
   public final edi b;
   public final edi c;
   public final int d;

   public ebj(edi $$0, edi $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
