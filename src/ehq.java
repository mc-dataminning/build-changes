import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehq {
   public static final Codec<ehq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emo.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, ehq::new)
   );
   public final jr<emo> b;
   public final float c;

   public ehq(jr<emo> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dhe $$0, dyr $$1, azg $$2, ji $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
