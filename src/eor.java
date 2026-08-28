import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eor extends eot {
   public static final MapCodec<eor> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, eor::new));

   protected eor(Either<aku, ero> $$0, jr<erm> $$1, eow.a $$2, Optional<eqy> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected erk a(dqe $$0, ene $$1, eqy $$2, boolean $$3) {
      erk $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(eqp.b);
      $$4.a(eqp.d);
      return $$4;
   }

   @Override
   public eov<?> a() {
      return eov.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
