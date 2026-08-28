import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class ept extends enk {
   public static final MapCodec<ept> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), elr.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, ept::new)
   );
   public final elr e;

   public ept(enk.c $$0, elr $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<enk.b> a(enk.a $$0) {
      edp $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      edn $$5 = new edn($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dgs $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      ji.a $$8 = new ji.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dwv $$9 = $$7.a($$6);
         dwv $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(djm.ej) || $$10.c(dfv.a, $$8.q($$6), jn.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         ji $$11 = new ji($$2, $$6, $$3);
         return Optional.of(new enk.b($$11, (Consumer<eoc>)($$3x -> eps.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public ent<?> e() {
      return ent.i;
   }
}
