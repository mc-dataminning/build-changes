import java.util.Collection;
import javax.annotation.Nullable;

public class cvf extends cwj {
   public cvf(cwj.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dwv $$0, dgg $$1, ji $$2, cov $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bsh.a));
      }

      return false;
   }

   @Override
   public bsi a(dag $$0) {
      cov $$1 = $$0.o();
      dgg $$2 = $$0.q();
      if (!$$2.C && $$1 != null) {
         ji $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bsi.d;
         }
      }

      return bsi.a;
   }

   private boolean a(cov $$0, dwv $$1, dgh $$2, ji $$3, boolean $$4, cwn $$5) {
      if (!$$0.gG()) {
         return false;
      } else {
         jr<djk> $$6 = $$1.c();
         dww<djk, dwv> $$7 = $$6.a().l();
         Collection<dxx<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, wo.a(this.l + ".empty", $$6.g()));
            return false;
         } else {
            cza $$9 = $$5.a(kv.V);
            if ($$9 == null) {
               return false;
            } else {
               dxx<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dwv $$11 = a($$1, $$10, $$0.fY());
                  $$2.a($$3, $$11, 18);
                  a($$0, wo.a(this.l + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fY());
                  $$5.b(kv.V, $$9.a($$6, $$10));
                  a($$0, wo.a(this.l + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dwv a(dwv $$0, dxx<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? af.b($$0, $$1) : af.a($$0, $$1);
   }

   private static void a(cov $$0, wo $$1) {
      ((ard)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dwv $$0, dxx<T> $$1) {
      return $$1.b($$0.c($$1));
   }
}
