import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eos extends eou {
   public static final MapCodec<eos> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, eos::new));

   protected eos(Either<akv, erp> $$0, jr<ern> $$1, eox.a $$2, Optional<eqz> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected erl a(dqf $$0, enf $$1, eqz $$2, boolean $$3) {
      erl $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(eqq.b);
      $$4.a(eqq.d);
      return $$4;
   }

   @Override
   public eow<?> a() {
      return eow.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
