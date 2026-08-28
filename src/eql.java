import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eql extends eqn {
   public static final MapCodec<eql> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, eql::new));

   protected eql(Either<ald, eti> $$0, js<etg> $$1, eqq.a $$2, Optional<ess> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected ete a(drm $$0, eoy $$1, ess $$2, boolean $$3) {
      ete $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(esj.b);
      $$4.a(esj.d);
      return $$4;
   }

   @Override
   public eqp<?> a() {
      return eqp.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
