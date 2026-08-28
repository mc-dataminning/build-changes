import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elz implements elx {
   public static final Codec<elz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eny.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               eny.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, elz::new)
   );
   public final eny b;
   public final eny c;
   public final int d;

   public elz(eny $$0, eny $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
