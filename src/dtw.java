import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtw {
   public static final Codec<dtw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dys.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, dtw::new)
   );
   public final ih<dys> b;
   public final float c;

   public dtw(ih<dys> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(cus $$0, dlm $$1, auw $$2, hx $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
