import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class emw extends emy {
   public static final MapCodec<emw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, emw::new));

   protected emw(Either<alh, ept> $$0, jp<epr> $$1, enb.a $$2, Optional<epd> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected epp a(dol $$0, elj $$1, epd $$2, boolean $$3) {
      epp $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(eou.b);
      $$4.a(eou.d);
      return $$4;
   }

   @Override
   public ena<?> a() {
      return ena.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
