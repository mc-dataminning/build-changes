import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eop extends eor {
   public static final MapCodec<eop> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, eop::new));

   protected eop(Either<aku, erm> $$0, jr<erk> $$1, eou.a $$2, Optional<eqw> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected eri a(dqc $$0, enc $$1, eqw $$2, boolean $$3) {
      eri $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(eqn.b);
      $$4.a(eqn.d);
      return $$4;
   }

   @Override
   public eot<?> a() {
      return eot.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
