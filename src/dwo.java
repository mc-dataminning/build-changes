import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwo {
   public static final Codec<dwo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ebk.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, dwo::new)
   );
   public final il<ebk> b;
   public final float c;

   public dwo(il<ebk> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(cwz $$0, dob $$1, awt $$2, ib $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
