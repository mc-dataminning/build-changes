import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class dvn extends dtz<dxb> {
   public dvn(Codec<dxb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dub<dxb> $$0) {
      cwm $$1 = $$0.b();
      hz $$2 = $$0.e();
      dxb $$3 = $$0.f();
      awp $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         hz $$6 = $$2.h($$5.getAsInt());
         jd $$7 = new jd($$3.c, $$3.c, $$3.c);
         ebd $$8 = ebd.a($$6.b($$7), $$6.a($$7));
         return hz.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, cyu.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(cwm $$0, hz $$1, dxb $$2) {
      Predicate<dlj> $$3 = $$0x -> $$0x.a(cyu.G);
      Predicate<dlj> $$4 = $$0x -> !$$0x.a(cyu.G);
      Optional<dql> $$5 = dql.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dql::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(cwm $$0, hz $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (ie $$2 : ie.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(cvs $$0, hz $$1) {
      dlj $$2 = $$0.a_($$1);
      return $$2.a(cyu.G) || $$2.i();
   }
}
