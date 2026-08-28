import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekn {
   public static final Codec<ekn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(epm.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, ekn::new)
   );
   public final je<epm> b;
   public final float c;

   public ekn(je<epm> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(djo $$0, ebm $$1, azt $$2, iu $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
