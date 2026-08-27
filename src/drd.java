import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drd {
   public static final Codec<drd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvz.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, drd::new)
   );
   public final ib<dvz> b;
   public final float c;

   public drd(ib<dvz> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(csm $$0, dit $$1, ato $$2, ht $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
