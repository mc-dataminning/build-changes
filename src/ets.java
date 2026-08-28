import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ets extends etu {
   public static final MapCodec<ets> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), f(), c()).apply($$0, ets::new));

   protected ets(Either<alr, ewp> $$0, jg<ewn> $$1, etx.a $$2, Optional<evz> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected ewl a(dui $$0, esf $$1, evz $$2, boolean $$3) {
      ewl $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(evq.b);
      $$4.a(evq.d);
      return $$4;
   }

   @Override
   public etw<?> a() {
      return etw.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
