import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpx implements dpv {
   public static final Codec<dpx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drw.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               drw.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dpx::new)
   );
   public final drw b;
   public final drw c;
   public final int d;

   public dpx(drw $$0, drw $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
