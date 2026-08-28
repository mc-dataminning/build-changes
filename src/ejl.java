import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejl {
   public static final Codec<ejl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eok.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, ejl::new)
   );
   public final js<eok> b;
   public final float c;

   public ejl(js<eok> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dio $$0, eak $$1, azs $$2, jj $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
