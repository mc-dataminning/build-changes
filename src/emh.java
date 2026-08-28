import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class emh extends emj {
   public static final MapCodec<emh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, emh::new));

   protected emh(Either<alc, epe> $$0, jn<epc> $$1, emm.a $$2, Optional<eoo> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected epa a(dnx $$0, eku $$1, eoo $$2, boolean $$3) {
      epa $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(eof.b);
      $$4.a(eof.d);
      return $$4;
   }

   @Override
   public eml<?> a() {
      return eml.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
