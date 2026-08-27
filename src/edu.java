import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class edu extends eca<efi> {
   public edu(Codec<efi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<efi> $$0) {
      dcv $$1 = $$0.b();
      ir $$2 = $$0.e();
      efi $$3 = $$0.f();
      ayt $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         ir $$6 = $$2.h($$5.getAsInt());
         jv $$7 = new jv($$3.c, $$3.c, $$3.c);
         ejl $$8 = ejl.a($$6.b($$7), $$6.a($$7));
         return ir.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dfe.lH.n(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dcv $$0, ir $$1, efi $$2) {
      Predicate<dtc> $$3 = $$0x -> $$0x.a(dfe.al);
      Predicate<dtc> $$4 = $$0x -> !$$0x.a(dfe.al);
      Optional<dyk> $$5 = dyk.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dyk::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dcv $$0, ir $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (iw $$2 : iw.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dcb $$0, ir $$1) {
      dtc $$2 = $$0.a_($$1);
      return $$2.a(dfe.al) || $$2.i();
   }
}
