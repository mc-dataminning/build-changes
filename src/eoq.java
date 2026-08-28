import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eoq extends eos {
   public static final MapCodec<eoq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, eoq::new));

   protected eoq(Either<akv, ern> $$0, jr<erl> $$1, eov.a $$2, Optional<eqx> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected erj a(dqd $$0, end $$1, eqx $$2, boolean $$3) {
      erj $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(eqo.b);
      $$4.a(eqo.d);
      return $$4;
   }

   @Override
   public eou<?> a() {
      return eou.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
