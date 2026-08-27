import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzy {
   public static final Codec<dzy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eeu.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, dzy::new)
   );
   public final in<eeu> b;
   public final float c;

   public dzy(in<eeu> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dab $$0, drf $$1, axt $$2, id $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
