import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class ely extends ekk<enn> {
   public ely(Codec<enn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<enn> $$0) {
      dkw $$1 = $$0.b();
      iv $$2 = $$0.e();
      enn $$3 = $$0.f();
      azx $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         iv $$6 = $$2.h($$5.getAsInt());
         ka $$7 = new ka($$3.c, $$3.c, $$3.c);
         ert $$8 = ert.a($$6.b($$7), $$6.a($$7));
         return iv.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dne.lp.m(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dkw $$0, iv $$1, enn $$2) {
      Predicate<ebe> $$3 = $$0x -> $$0x.a(dne.J);
      Predicate<ebe> $$4 = $$0x -> !$$0x.a(dne.J);
      Optional<egt> $$5 = egt.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(egt::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dkw $$0, iv $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.e())) {
         for (jb $$2 : jb.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(djy $$0, iv $$1) {
      ebe $$2 = $$0.a_($$1);
      return $$2.a(dne.J) || $$2.l();
   }
}
