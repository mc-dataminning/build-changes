import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class epo extends epq {
   public static final MapCodec<epo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, epo::new));

   protected epo(Either<alz, esl> $$0, jq<esj> $$1, ept.a $$2, Optional<erv> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected esh a(drb $$0, eob $$1, erv $$2, boolean $$3) {
      esh $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(erm.b);
      $$4.a(erm.d);
      return $$4;
   }

   @Override
   public eps<?> a() {
      return eps.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
