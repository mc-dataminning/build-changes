import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dow extends dnw<dqp> {
   public dow(Codec<dqp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dny<dqp> $$0) {
      dqp $$1 = $$0.f();
      cqp $$2 = $$0.b();
      asc $$3 = $$0.d();
      csv $$4 = $$1.b.b();
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

            dfj $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static gw a(cpw $$0, gw.a $$1, csv $$2) {
      while ($$1.v() > $$0.H_() + 1) {
         dfj $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(ha.a);
      }

      return null;
   }
}
