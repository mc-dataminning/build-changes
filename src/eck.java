import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class eck extends eaw<edy> {
   public eck(Codec<edy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eay<edy> $$0) {
      dcr $$1 = $$0.b();
      iz $$2 = $$0.e();
      edy $$3 = $$0.f();
      azf $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         iz $$6 = $$2.h($$5.getAsInt());
         kd $$7 = new kd($$3.c, $$3.c, $$3.c);
         eia $$8 = eia.a($$6.b($$7), $$6.a($$7));
         return iz.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dez.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dcr $$0, iz $$1, edy $$2) {
      Predicate<dsa> $$3 = $$0x -> $$0x.a(dez.G);
      Predicate<dsa> $$4 = $$0x -> !$$0x.a(dez.G);
      Optional<dxi> $$5 = dxi.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dxi::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dcr $$0, iz $$1) {
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

   private boolean a(dbx $$0, iz $$1) {
      dsa $$2 = $$0.a_($$1);
      return $$2.a(dez.G) || $$2.i();
   }
}
