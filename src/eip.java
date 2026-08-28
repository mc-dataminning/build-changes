import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eip {
   public static final Codec<eip> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(enn.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, eip::new)
   );
   public final jq<enn> b;
   public final float c;

   public eip(jq<enn> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dif $$0, dzq $$1, bam $$2, jh $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
