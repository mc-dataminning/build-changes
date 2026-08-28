import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehr {
   public static final Codec<ehr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emp.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, ehr::new)
   );
   public final jr<emp> b;
   public final float c;

   public ehr(jr<emp> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dhf $$0, dys $$1, azh $$2, ji $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
