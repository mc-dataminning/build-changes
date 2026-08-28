import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class els {
   public static final Codec<els> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eqr.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, els::new)
   );
   public final jf<eqr> b;
   public final float c;

   public els(jf<eqr> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dkl $$0, ecr $$1, azv $$2, iv $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
