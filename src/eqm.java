import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class eqm extends eod {
   public static final MapCodec<eqm> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), emk.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, eqm::new)
   );
   public final emk e;

   public eqm(eod.c $$0, emk $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eod.b> a(eod.a $$0) {
      eei $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      eeg $$5 = new eeg($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dhl $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      jh.a $$8 = new jh.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dxo $$9 = $$7.a($$6);
         dxo $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(dkf.ej) || $$10.c(dgo.a, $$8.q($$6), jm.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         jh $$11 = new jh($$2, $$6, $$3);
         return Optional.of(new eod.b($$11, (Consumer<eov>)($$3x -> eql.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public eom<?> e() {
      return eom.i;
   }
}
