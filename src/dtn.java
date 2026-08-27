import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtn {
   public static final Codec<dtn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyj.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, dtn::new)
   );
   public final ih<dyj> b;
   public final float c;

   public dtn(ih<dyj> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(cuj $$0, dld $$1, auu $$2, hx $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
