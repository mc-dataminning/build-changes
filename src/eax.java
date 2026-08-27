import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eax {
   public static final Codec<eax> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eft.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, eax::new)
   );
   public final iw<eft> b;
   public final float c;

   public eax(iw<eft> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(day $$0, dse $$1, ayg $$2, in $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
