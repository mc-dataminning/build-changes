import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class eco extends eba<eec> {
   public eco(Codec<eec> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebc<eec> $$0) {
      dcv $$1 = $$0.b();
      iz $$2 = $$0.e();
      eec $$3 = $$0.f();
      azh $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         iz $$6 = $$2.h($$5.getAsInt());
         kd $$7 = new kd($$3.c, $$3.c, $$3.c);
         eie $$8 = eie.a($$6.b($$7), $$6.a($$7));
         return iz.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dfd.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dcv $$0, iz $$1, eec $$2) {
      Predicate<dse> $$3 = $$0x -> $$0x.a(dfd.G);
      Predicate<dse> $$4 = $$0x -> !$$0x.a(dfd.G);
      Optional<dxm> $$5 = dxm.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dxm::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dcv $$0, iz $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (je $$2 : je.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dcb $$0, iz $$1) {
      dse $$2 = $$0.a_($$1);
      return $$2.a(dfd.G) || $$2.i();
   }
}
