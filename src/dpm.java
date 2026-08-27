import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class dpm extends dny<dra> {
   public dpm(Codec<dra> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doa<dra> $$0) {
      cqr $$1 = $$0.b();
      gw $$2 = $$0.e();
      dra $$3 = $$0.f();
      ase $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         gw $$6 = $$2.h($$5.getAsInt());
         ib $$7 = new ib($$3.c, $$3.c, $$3.c);
         ehk $$8 = new ehk($$6.b($$7), $$6.a($$7));
         return gw.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, csy.kJ.n(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(cqr $$0, gw $$1, dra $$2) {
      Predicate<dfl> $$3 = $$0x -> $$0x.a(csy.G);
      Predicate<dfl> $$4 = $$0x -> !$$0x.a(csy.G);
      Optional<dkk> $$5 = dkk.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dkk::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(cqr $$0, gw $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (hc $$2 : hc.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(cpy $$0, gw $$1) {
      dfl $$2 = $$0.a_($$1);
      return $$2.a(csy.G) || $$2.i();
   }
}
