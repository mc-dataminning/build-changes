import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class dtq extends dsc<dve> {
   public dtq(Codec<dve> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dse<dve> $$0) {
      cus $$1 = $$0.b();
      hx $$2 = $$0.e();
      dve $$3 = $$0.f();
      auw $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         hx $$6 = $$2.h($$5.getAsInt());
         jb $$7 = new jb($$3.c, $$3.c, $$3.c);
         dzg $$8 = dzg.a($$6.b($$7), $$6.a($$7));
         return hx.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, cxa.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(cus $$0, hx $$1, dve $$2) {
      Predicate<djp> $$3 = $$0x -> $$0x.a(cxa.G);
      Predicate<djp> $$4 = $$0x -> !$$0x.a(cxa.G);
      Optional<doo> $$5 = doo.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(doo::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(cus $$0, hx $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (ic $$2 : ic.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(cty $$0, hx $$1) {
      djp $$2 = $$0.a_($$1);
      return $$2.a(cxa.G) || $$2.i();
   }
}
