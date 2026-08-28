import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecq {
   public static final Codec<ecq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehm.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, ecq::new)
   );
   public final ji<ehm> b;
   public final float c;

   public ecq(ji<ehm> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dcr $$0, dtx $$1, azf $$2, iz $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
