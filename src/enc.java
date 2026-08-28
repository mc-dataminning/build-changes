import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class enc extends ene {
   public static final MapCodec<enc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, enc::new));

   protected enc(Either<ali, epz> $$0, jq<epx> $$1, enh.a $$2, Optional<epj> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected epv a(dor $$0, elp $$1, epj $$2, boolean $$3) {
      epv $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(epa.b);
      $$4.a(epa.d);
      return $$4;
   }

   @Override
   public eng<?> a() {
      return eng.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
