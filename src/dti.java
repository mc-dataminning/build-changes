import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class dti extends dru<duw> {
   public dti(Codec<duw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drw<duw> $$0) {
      cuk $$1 = $$0.b();
      hx $$2 = $$0.e();
      duw $$3 = $$0.f();
      auv $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         hx $$6 = $$2.h($$5.getAsInt());
         jb $$7 = new jb($$3.c, $$3.c, $$3.c);
         dyy $$8 = dyy.a($$6.b($$7), $$6.a($$7));
         return hx.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, cws.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(cuk $$0, hx $$1, duw $$2) {
      Predicate<djh> $$3 = $$0x -> $$0x.a(cws.G);
      Predicate<djh> $$4 = $$0x -> !$$0x.a(cws.G);
      Optional<dog> $$5 = dog.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dog::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(cuk $$0, hx $$1) {
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

   private boolean a(ctq $$0, hx $$1) {
      djh $$2 = $$0.a_($$1);
      return $$2.a(cws.G) || $$2.i();
   }
}
