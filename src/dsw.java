import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsw {
   public static final Codec<dsw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dxs.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, dsw::new)
   );
   public final ie<dxs> b;
   public final float c;

   public dsw(ie<dxs> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(ctt $$0, dkm $$1, auf $$2, hv $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
