import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ede {
   public static final Codec<ede> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eia.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, ede::new)
   );
   public final jj<eia> b;
   public final float c;

   public ede(jj<eia> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(ddb $$0, duh $$1, ayo $$2, ja $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
