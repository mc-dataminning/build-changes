import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class etr extends eri {
   public static final MapCodec<etr> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), epp.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, etr::new)
   );
   public final epp e;

   public etr(eri.c $$0, epp $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eri.b> a(eri.a $$0) {
      ehm $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      ehk $$5 = new ehk($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      djt $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      iv.a $$8 = new iv.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         eao $$9 = $$7.a($$6);
         eao $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(dmo.en) || $$10.c(dix.a, $$8.q($$6), jb.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         iv $$11 = new iv($$2, $$6, $$3);
         return Optional.of(new eri.b($$11, (Consumer<esa>)($$3x -> etq.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public err<?> e() {
      return err.i;
   }
}
