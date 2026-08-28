import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class enn extends enp {
   public static final MapCodec<enn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, enn::new));

   protected enn(Either<alj, eqk> $$0, jq<eqi> $$1, ens.a $$2, Optional<epu> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected eqg a(dpd $$0, ema $$1, epu $$2, boolean $$3) {
      eqg $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(epl.b);
      $$4.a(epl.d);
      return $$4;
   }

   @Override
   public enr<?> a() {
      return enr.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
