import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvm {
   public static final Codec<dvm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eai.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, dvm::new)
   );
   public final ij<eai> b;
   public final float c;

   public dvm(ij<eai> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(cwi $$0, dnc $$1, awo $$2, hz $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
