import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ect {
   public static final Codec<ect> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehp.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, ect::new)
   );
   public final ji<ehp> b;
   public final float c;

   public ect(ji<ehp> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dcu $$0, dua $$1, azh $$2, iz $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
