import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eci extends eck {
   public static final Codec<eci> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, eci::new));

   protected eci(Either<aiy, efe> $$0, ij<efc> $$1, ecn.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected efa a(dfa $$0, eaw $$1, boolean $$2) {
      efa $$3 = super.a($$0, $$1, $$2);
      $$3.b(eeg.b);
      $$3.a(eeg.d);
      return $$3;
   }

   @Override
   public ecm<?> a() {
      return ecm.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
