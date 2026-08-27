import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpf {
   public static final Codec<dpf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dub.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, dpf::new)
   );
   public final hf<dub> b;
   public final float c;

   public dpf(hf<dub> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(cqe $$0, dgv $$1, art $$2, gv $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
