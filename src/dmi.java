import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmi {
   public static final Codec<dmi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dre.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, dmi::new)
   );
   public final he<dre> b;
   public final float c;

   public dmi(he<dre> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(cng $$0, ddy $$1, apf $$2, gu $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
