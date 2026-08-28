import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class ecm extends eay<eea> {
   public ecm(Codec<eea> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eba<eea> $$0) {
      dct $$1 = $$0.b();
      iz $$2 = $$0.e();
      eea $$3 = $$0.f();
      azh $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         iz $$6 = $$2.h($$5.getAsInt());
         kd $$7 = new kd($$3.c, $$3.c, $$3.c);
         eic $$8 = eic.a($$6.b($$7), $$6.a($$7));
         return iz.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dfb.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dct $$0, iz $$1, eea $$2) {
      Predicate<dsc> $$3 = $$0x -> $$0x.a(dfb.G);
      Predicate<dsc> $$4 = $$0x -> !$$0x.a(dfb.G);
      Optional<dxk> $$5 = dxk.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dxk::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dct $$0, iz $$1) {
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

   private boolean a(dbz $$0, iz $$1) {
      dsc $$2 = $$0.a_($$1);
      return $$2.a(dfb.G) || $$2.i();
   }
}
