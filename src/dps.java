import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dps {
   public static final Codec<dps> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(duo.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, dps::new)
   );
   public final hg<duo> b;
   public final float c;

   public dps(hg<duo> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(cqr $$0, dhi $$1, ase $$2, gw $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
