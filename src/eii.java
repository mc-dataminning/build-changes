import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eii {
   public static final Codec<eii> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eng.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, eii::new)
   );
   public final jq<eng> b;
   public final float c;

   public eii(jq<eng> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dhy $$0, dzj $$1, bam $$2, jh $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
