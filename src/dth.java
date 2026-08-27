import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class dth extends drt<duv> {
   public dth(Codec<duv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drv<duv> $$0) {
      cuj $$1 = $$0.b();
      hx $$2 = $$0.e();
      duv $$3 = $$0.f();
      auu $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         hx $$6 = $$2.h($$5.getAsInt());
         jb $$7 = new jb($$3.c, $$3.c, $$3.c);
         dyx $$8 = dyx.a($$6.b($$7), $$6.a($$7));
         return hx.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, cwr.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(cuj $$0, hx $$1, duv $$2) {
      Predicate<djg> $$3 = $$0x -> $$0x.a(cwr.G);
      Predicate<djg> $$4 = $$0x -> !$$0x.a(cwr.G);
      Optional<dof> $$5 = dof.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dof::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(cuj $$0, hx $$1) {
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

   private boolean a(ctp $$0, hx $$1) {
      djg $$2 = $$0.a_($$1);
      return $$2.a(cwr.G) || $$2.i();
   }
}
