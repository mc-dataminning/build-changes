import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class esr extends eqi {
   public static final MapCodec<esr> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), eop.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, esr::new)
   );
   public final eop e;

   public esr(eqi.c $$0, eop $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eqi.b> a(eqi.a $$0) {
      egm $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      egk $$5 = new egk($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      djb $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      iu.a $$8 = new iu.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dzo $$9 = $$7.a($$6);
         dzo $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(dlw.ej) || $$10.c(dif.a, $$8.q($$6), ja.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         iu $$11 = new iu($$2, $$6, $$3);
         return Optional.of(new eqi.b($$11, (Consumer<era>)($$3x -> esq.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public eqr<?> e() {
      return eqr.i;
   }
}
