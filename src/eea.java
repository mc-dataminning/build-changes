import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eea {
   public static final Codec<eea> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eix.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, eea::new)
   );
   public final ja<eix> b;
   public final float c;

   public eea(ja<eix> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dcv $$0, duz $$1, ayt $$2, ir $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
