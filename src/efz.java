import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class efz extends eel<ehn> {
   public efz(Codec<ehn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(een<ehn> $$0) {
      dfy $$1 = $$0.b();
      jh $$2 = $$0.e();
      ehn $$3 = $$0.f();
      azs $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         jh $$6 = $$2.h($$5.getAsInt());
         kl $$7 = new kl($$3.c, $$3.c, $$3.c);
         elp $$8 = elp.a($$6.b($$7), $$6.a($$7));
         return jh.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dig.kJ.m(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dfy $$0, jh $$1, ehn $$2) {
      Predicate<dvj> $$3 = $$0x -> $$0x.a(dig.G);
      Predicate<dvj> $$4 = $$0x -> !$$0x.a(dig.G);
      Optional<eav> $$5 = eav.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(eav::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dfy $$0, jh $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.e())) {
         for (jm $$2 : jm.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dfc $$0, jh $$1) {
      dvj $$2 = $$0.a_($$1);
      return $$2.a(dig.G) || $$2.l();
   }
}
