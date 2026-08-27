import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class eai extends dyu<ebw> {
   public eai(Codec<ebw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyw<ebw> $$0) {
      dap $$1 = $$0.b();
      im $$2 = $$0.e();
      ebw $$3 = $$0.f();
      ayd $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         im $$6 = $$2.h($$5.getAsInt());
         jq $$7 = new jq($$3.c, $$3.c, $$3.c);
         efy $$8 = efy.a($$6.b($$7), $$6.a($$7));
         return im.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dcx.kJ.n(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dap $$0, im $$1, ebw $$2) {
      Predicate<dpy> $$3 = $$0x -> $$0x.a(dcx.G);
      Predicate<dpy> $$4 = $$0x -> !$$0x.a(dcx.G);
      Optional<dvg> $$5 = dvg.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dvg::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dap $$0, im $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (ir $$2 : ir.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(czv $$0, im $$1) {
      dpy $$2 = $$0.a_($$1);
      return $$2.a(dcx.G) || $$2.i();
   }
}
