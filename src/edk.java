import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edk extends edm {
   public static final Codec<edk> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, edk::new));

   protected edk(Either<ajc, egg> $$0, il<ege> $$1, edp.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected egc a(dfr $$0, eby $$1, boolean $$2) {
      egc $$3 = super.a($$0, $$1, $$2);
      $$3.b(efi.b);
      $$3.a(efi.d);
      return $$3;
   }

   @Override
   public edo<?> a() {
      return edo.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
