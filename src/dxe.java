import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class dxe extends dvq<dys> {
   public dxe(Codec<dys> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvs<dys> $$0) {
      cxu $$1 = $$0.b();
      ib $$2 = $$0.e();
      dys $$3 = $$0.f();
      axd $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         ib $$6 = $$2.h($$5.getAsInt());
         jg $$7 = new jg($$3.c, $$3.c, $$3.c);
         ecu $$8 = ecu.a($$6.b($$7), $$6.a($$7));
         return ib.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dac.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(cxu $$0, ib $$1, dys $$2) {
      Predicate<dmz> $$3 = $$0x -> $$0x.a(dac.G);
      Predicate<dmz> $$4 = $$0x -> !$$0x.a(dac.G);
      Optional<dsc> $$5 = dsc.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dsc::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(cxu $$0, ib $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (ih $$2 : ih.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(cxa $$0, ib $$1) {
      dmz $$2 = $$0.a_($$1);
      return $$2.a(dac.G) || $$2.i();
   }
}
