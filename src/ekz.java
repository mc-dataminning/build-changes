import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekz implements ekx {
   public static final Codec<ekz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               emy.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               emy.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ekz::new)
   );
   public final emy b;
   public final emy c;
   public final int d;

   public ekz(emy $$0, emy $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
