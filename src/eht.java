import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eht {
   public static final Codec<eht> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emr.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, eht::new)
   );
   public final jr<emr> b;
   public final float c;

   public eht(jr<emr> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dhh $$0, dyu $$1, azh $$2, ji $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
