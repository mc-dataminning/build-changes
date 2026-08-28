import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class ecz extends ebl<een> {
   public ecz(Codec<een> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebn<een> $$0) {
      ddc $$1 = $$0.b();
      ja $$2 = $$0.e();
      een $$3 = $$0.f();
      ayo $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         ja $$6 = $$2.h($$5.getAsInt());
         ke $$7 = new ke($$3.c, $$3.c, $$3.c);
         eip $$8 = eip.a($$6.b($$7), $$6.a($$7));
         return ja.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dfk.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(ddc $$0, ja $$1, een $$2) {
      Predicate<dsl> $$3 = $$0x -> $$0x.a(dfk.G);
      Predicate<dsl> $$4 = $$0x -> !$$0x.a(dfk.G);
      Optional<dxw> $$5 = dxw.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dxw::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(ddc $$0, ja $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (jf $$2 : jf.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dch $$0, ja $$1) {
      dsl $$2 = $$0.a_($$1);
      return $$2.a(dfk.G) || $$2.i();
   }
}
