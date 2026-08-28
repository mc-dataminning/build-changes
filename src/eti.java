import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eti extends etk {
   public static final MapCodec<eti> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), f(), c()).apply($$0, eti::new));

   protected eti(Either<alk, ewf> $$0, jg<ewd> $$1, etn.a $$2, Optional<evp> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected ewb a(dty $$0, erv $$1, evp $$2, boolean $$3) {
      ewb $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(evg.b);
      $$4.a(evg.d);
      return $$4;
   }

   @Override
   public etm<?> a() {
      return etm.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
