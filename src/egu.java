import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egu extends egw {
   public static final Codec<egu> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, egu::new));

   protected egu(Either<ajv, ejq> $$0, in<ejo> $$1, egz.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ejm a(dit $$0, efi $$1, boolean $$2) {
      ejm $$3 = super.a($$0, $$1, $$2);
      $$3.b(eis.b);
      $$3.a(eis.d);
      return $$3;
   }

   @Override
   public egy<?> a() {
      return egy.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
