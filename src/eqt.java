import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class eqt extends eok {
   public static final MapCodec<eqt> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), emr.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, eqt::new)
   );
   public final emr e;

   public eqt(eok.c $$0, emr $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eok.b> a(eok.a $$0) {
      eep $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      een $$5 = new een($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dhu $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      jh.a $$8 = new jh.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dxv $$9 = $$7.a($$6);
         dxv $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(dko.ej) || $$10.c(dgx.a, $$8.q($$6), jm.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         jh $$11 = new jh($$2, $$6, $$3);
         return Optional.of(new eok.b($$11, (Consumer<epc>)($$3x -> eqs.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public eot<?> e() {
      return eot.i;
   }
}
