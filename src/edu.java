import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edu {
   public static final Codec<edu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eiq.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, edu::new)
   );
   public final jm<eiq> b;
   public final float c;

   public edu(jm<eiq> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(ddq $$0, dux $$1, ayv $$2, jd $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
