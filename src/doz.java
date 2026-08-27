import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class doz extends dnl<dqn> {
   public doz(Codec<dqn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dqn> $$0) {
      cqe $$1 = $$0.b();
      gv $$2 = $$0.e();
      dqn $$3 = $$0.f();
      art $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if (!$$5.isPresent()) {
         return false;
      } else {
         gv $$6 = $$2.h($$5.getAsInt());
         ia $$7 = new ia($$3.c, $$3.c, $$3.c);
         eha $$8 = new eha($$6.b($$7), $$6.a($$7));
         return gv.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, csl.kJ.n(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(cqe $$0, gv $$1, dqn $$2) {
      Predicate<dey> $$3 = $$0x -> $$0x.a(csl.G);
      Predicate<dey> $$4 = $$0x -> !$$0x.a(csl.G);
      Optional<djx> $$5 = djx.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(djx::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(cqe $$0, gv $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (hb $$2 : hb.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(cpl $$0, gv $$1) {
      dey $$2 = $$0.a_($$1);
      return $$2.a(csl.G) || $$2.i();
   }
}
