import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eph extends epj {
   public static final MapCodec<eph> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, eph::new));

   protected eph(Either<alz, ese> $$0, jq<esc> $$1, epm.a $$2, Optional<ero> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected esa a(dqu $$0, enu $$1, ero $$2, boolean $$3) {
      esa $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(erf.b);
      $$4.a(erf.d);
      return $$4;
   }

   @Override
   public epl<?> a() {
      return epl.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
