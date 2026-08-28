import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecn {
   public static final Codec<ecn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehj.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, ecn::new)
   );
   public final ji<ehj> b;
   public final float c;

   public ecn(ji<ehj> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dco $$0, dtu $$1, azc $$2, iz $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
