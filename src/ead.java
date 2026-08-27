import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ead extends eaf {
   public static final Codec<ead> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, ead::new));

   protected ead(Either<ahd, ecz> $$0, ih<ecx> $$1, eai.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ecv a(dcv $$0, dyr $$1, boolean $$2) {
      ecv $$3 = super.a($$0, $$1, $$2);
      $$3.b(ecb.b);
      $$3.a(ecb.d);
      return $$3;
   }

   @Override
   public eah<?> a() {
      return eah.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
