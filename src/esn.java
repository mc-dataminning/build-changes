import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class esn extends esp {
   public static final MapCodec<esn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), f(), c()).apply($$0, esn::new));

   protected esn(Either<alg, evk> $$0, jf<evi> $$1, ess.a $$2, Optional<euu> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected evg a(dtg $$0, era $$1, euu $$2, boolean $$3) {
      evg $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(eul.b);
      $$4.a(eul.d);
      return $$4;
   }

   @Override
   public esr<?> a() {
      return esr.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
