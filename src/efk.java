import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efk {
   public static final Codec<efk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekg.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, efk::new)
   );
   public final jn<ekg> b;
   public final float c;

   public efk(jn<ekg> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dfd $$0, dwl $$1, azl $$2, je $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
