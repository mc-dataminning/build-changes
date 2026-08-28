import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elg {
   public static final Codec<elg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eqf.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, elg::new)
   );
   public final je<eqf> b;
   public final float c;

   public elg(je<eqf> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(djz $$0, ecf $$1, azv $$2, iu $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
