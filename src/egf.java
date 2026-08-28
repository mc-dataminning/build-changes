import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egf {
   public static final Codec<egf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(elb.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, egf::new)
   );
   public final jq<elb> b;
   public final float c;

   public egf(jq<elb> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dfy $$0, dxg $$1, azs $$2, jh $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
