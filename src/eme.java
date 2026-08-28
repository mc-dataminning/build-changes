import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eme {
   public static final Codec<eme> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(erf.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, eme::new)
   );
   public final jf<erf> b;
   public final float c;

   public eme(jf<erf> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dkw $$0, edc $$1, azx $$2, iv $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
