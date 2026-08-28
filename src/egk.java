import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class egk extends eew<ehy> {
   public egk(Codec<ehy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eey<ehy> $$0) {
      dgk $$1 = $$0.b();
      jh $$2 = $$0.e();
      ehy $$3 = $$0.f();
      azu $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         jh $$6 = $$2.h($$5.getAsInt());
         kl $$7 = new kl($$3.c, $$3.c, $$3.c);
         ema $$8 = ema.a($$6.b($$7), $$6.a($$7));
         return jh.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dis.kJ.m(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dgk $$0, jh $$1, ehy $$2) {
      Predicate<dvv> $$3 = $$0x -> $$0x.a(dis.G);
      Predicate<dvv> $$4 = $$0x -> !$$0x.a(dis.G);
      Optional<ebg> $$5 = ebg.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(ebg::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dgk $$0, jh $$1) {
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

   private boolean a(dfn $$0, jh $$1) {
      dvv $$2 = $$0.a_($$1);
      return $$2.a(dis.G) || $$2.l();
   }
}
