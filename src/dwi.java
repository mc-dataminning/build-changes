import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class dwi extends duu<dxw> {
   public dwi(Codec<dxw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(duw<dxw> $$0) {
      cwz $$1 = $$0.b();
      ib $$2 = $$0.e();
      dxw $$3 = $$0.f();
      awt $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         ib $$6 = $$2.h($$5.getAsInt());
         jf $$7 = new jf($$3.c, $$3.c, $$3.c);
         eby $$8 = eby.a($$6.b($$7), $$6.a($$7));
         return ib.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, czh.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(cwz $$0, ib $$1, dxw $$2) {
      Predicate<dme> $$3 = $$0x -> $$0x.a(czh.G);
      Predicate<dme> $$4 = $$0x -> !$$0x.a(czh.G);
      Optional<drg> $$5 = drg.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(drg::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(cwz $$0, ib $$1) {
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

   private boolean a(cwf $$0, ib $$1) {
      dme $$2 = $$0.a_($$1);
      return $$2.a(czh.G) || $$2.i();
   }
}
