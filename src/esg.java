import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class esg extends esi {
   public static final MapCodec<esg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, esg::new));

   protected esg(Either<alg, evd> $$0, je<evb> $$1, esl.a $$2, Optional<eun> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected euz a(dsz $$0, eqt $$1, eun $$2, boolean $$3) {
      euz $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(eue.b);
      $$4.a(eue.d);
      return $$4;
   }

   @Override
   public esk<?> a() {
      return esk.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
