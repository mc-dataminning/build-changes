import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class doq extends dnq<dqj> {
   public doq(Codec<dqj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dns<dqj> $$0) {
      dqj $$1 = $$0.f();
      cqv $$2 = $$0.b();
      ash $$3 = $$0.d();
      ctc $$4 = $$1.b.b();
      gw $$5 = a($$2, $$0.e().j().a(ha.a.b, $$2.H_() + 1, $$2.aj() - 1), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (gw $$11 : gw.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            dfd $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static gw a(cqc $$0, gw.a $$1, ctc $$2) {
      while ($$1.v() > $$0.H_() + 1) {
         dfd $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(ha.a);
      }

      return null;
   }
}
