import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edf {
   public static final Codec<edf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eib.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, edf::new)
   );
   public final jj<eib> b;
   public final float c;

   public edf(jj<eib> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(ddc $$0, dui $$1, ayo $$2, ja $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
