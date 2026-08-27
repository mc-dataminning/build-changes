import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwc extends dwe {
   public static final Codec<dwc> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dwc::new));

   protected dwc(Either<aer, dyr> $$0, he<dyp> $$1, dwh.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dyn a(cyx $$0, duq $$1, boolean $$2) {
      dyn $$3 = super.a($$0, $$1, $$2);
      $$3.b(dxt.b);
      $$3.a(dxt.d);
      return $$3;
   }

   @Override
   public dwg<?> a() {
      return dwg.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
