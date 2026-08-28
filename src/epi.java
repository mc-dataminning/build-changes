import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class epi extends epk {
   public static final MapCodec<epi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, epi::new));

   protected epi(Either<alp, esf> $$0, jq<esd> $$1, epn.a $$2, Optional<erp> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected esb a(dqv $$0, env $$1, erp $$2, boolean $$3) {
      esb $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(erg.b);
      $$4.a(erg.d);
      return $$4;
   }

   @Override
   public epm<?> a() {
      return epm.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
