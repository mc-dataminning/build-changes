import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edy {
   public static final Codec<edy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eiv.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, edy::new)
   );
   public final jm<eiv> b;
   public final float c;

   public edy(jm<eiv> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dds $$0, duz $$1, ayw $$2, jd $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
