import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpk {
   public static final Codec<dpk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dug.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, dpk::new)
   );
   public final he<dug> b;
   public final float c;

   public dpk(he<dug> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(cqv $$0, dha $$1, ash $$2, gw $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
