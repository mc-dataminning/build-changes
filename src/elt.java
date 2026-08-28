import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class elt extends elv {
   public static final MapCodec<elt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, elt::new));

   protected elt(Either<alb, eoq> $$0, jn<eoo> $$1, ely.a $$2, Optional<eoa> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected eom a(dnj $$0, ekg $$1, eoa $$2, boolean $$3) {
      eom $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(enr.b);
      $$4.a(enr.d);
      return $$4;
   }

   @Override
   public elx<?> a() {
      return elx.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
