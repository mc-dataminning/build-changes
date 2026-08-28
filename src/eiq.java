import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eiq {
   public static final Codec<eiq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eno.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, eiq::new)
   );
   public final jq<eno> b;
   public final float c;

   public eiq(jq<eno> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dig $$0, dzr $$1, bam $$2, jh $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
