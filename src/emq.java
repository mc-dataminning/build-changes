import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emq {
   public static final Codec<emq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(err.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, emq::new)
   );
   public final jg<err> b;
   public final float c;

   public emq(jg<err> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dli $$0, edo $$1, bai $$2, iw $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
