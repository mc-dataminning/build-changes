import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eln {
   public static final Codec<eln> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eqm.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, eln::new)
   );
   public final jf<eqm> b;
   public final float c;

   public eln(jf<eqm> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dkg $$0, ecm $$1, azv $$2, iv $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
