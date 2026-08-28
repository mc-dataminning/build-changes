import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ess extends esu {
   public static final MapCodec<ess> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), f(), c()).apply($$0, ess::new));

   protected ess(Either<alg, evp> $$0, jf<evn> $$1, esx.a $$2, Optional<euz> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected evl a(dtl $$0, erf $$1, euz $$2, boolean $$3) {
      evl $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(euq.b);
      $$4.a(euq.d);
      return $$4;
   }

   @Override
   public esw<?> a() {
      return esw.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
