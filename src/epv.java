import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class epv extends enm {
   public static final MapCodec<epv> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), elt.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, epv::new)
   );
   public final elt e;

   public epv(enm.c $$0, elt $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<enm.b> a(enm.a $$0) {
      edr $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      edp $$5 = new edp($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dgu $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      ji.a $$8 = new ji.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dwx $$9 = $$7.a($$6);
         dwx $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(djo.ej) || $$10.c(dfx.a, $$8.q($$6), jn.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         ji $$11 = new ji($$2, $$6, $$3);
         return Optional.of(new enm.b($$11, (Consumer<eoe>)($$3x -> epu.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public env<?> e() {
      return env.i;
   }
}
