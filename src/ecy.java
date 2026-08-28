import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecy {
   public static final Codec<ecy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehu.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, ecy::new)
   );
   public final jj<ehu> b;
   public final float c;

   public ecy(jj<ehu> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dcz $$0, due $$1, aym $$2, ja $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
