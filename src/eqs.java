import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class eqs extends eoj {
   public static final MapCodec<eqs> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), emq.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, eqs::new)
   );
   public final emq e;

   public eqs(eoj.c $$0, emq $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eoj.b> a(eoj.a $$0) {
      eeo $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      eem $$5 = new eem($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dht $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      jh.a $$8 = new jh.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dxu $$9 = $$7.a($$6);
         dxu $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(dkn.ej) || $$10.c(dgw.a, $$8.q($$6), jm.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         jh $$11 = new jh($$2, $$6, $$3);
         return Optional.of(new eoj.b($$11, (Consumer<epb>)($$3x -> eqr.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public eos<?> e() {
      return eos.i;
   }
}
