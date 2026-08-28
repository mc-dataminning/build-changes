import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eif implements eid {
   public static final Codec<eif> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eke.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               eke.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eif::new)
   );
   public final eke b;
   public final eke c;
   public final int d;

   public eif(eke $$0, eke $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
