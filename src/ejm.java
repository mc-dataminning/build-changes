import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejm extends ejo {
   public static final MapCodec<ejm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, ejm::new));

   protected ejm(Either<ale, emi> $$0, ji<emg> $$1, ejr.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eme a(dlk $$0, eia $$1, boolean $$2) {
      eme $$3 = super.a($$0, $$1, $$2);
      $$3.b(elk.b);
      $$3.a(elk.d);
      return $$3;
   }

   @Override
   public ejq<?> a() {
      return ejq.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
