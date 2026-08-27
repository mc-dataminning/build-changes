import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvt {
   public static final Codec<dvt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eap.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, dvt::new)
   );
   public final ij<eap> b;
   public final float c;

   public dvt(ij<eap> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(cwm $$0, dng $$1, awp $$2, hz $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
