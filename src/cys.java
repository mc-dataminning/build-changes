import java.util.Collection;
import javax.annotation.Nullable;

public class cys extends czu {
   public cys(czu.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(czy $$0, ebe $$1, djx $$2, iv $$3, bxu $$4) {
      if (!$$2.C && $$4 instanceof crx $$5) {
         this.a($$5, $$1, $$2, $$3, false, $$0);
      }

      return false;
   }

   @Override
   public bur a(ddt $$0) {
      crx $$1 = $$0.o();
      djx $$2 = $$0.q();
      if (!$$2.C && $$1 != null) {
         iv $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bur.d;
         }
      }

      return bur.a;
   }

   private boolean a(crx $$0, ebe $$1, djy $$2, iv $$3, boolean $$4, czy $$5) {
      if (!$$0.gG()) {
         return false;
      } else {
         jf<dnc> $$6 = $$1.c();
         ebf<dnc, ebe> $$7 = $$6.a().l();
         Collection<ech<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, xa.a(this.n + ".empty", $$6.g()));
            return false;
         } else {
            dck $$9 = $$5.a(kk.X);
            if ($$9 == null) {
               return false;
            } else {
               ech<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  ebe $$11 = a($$1, $$10, $$0.fY());
                  $$2.a($$3, $$11, 18);
                  a($$0, xa.a(this.n + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fY());
                  $$5.b(kk.X, $$9.a($$6, $$10));
                  a($$0, xa.a(this.n + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> ebe a(ebe $$0, ech<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ag.b($$0, $$1) : ag.a($$0, $$1);
   }

   private static void a(crx $$0, xa $$1) {
      ((art)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(ebe $$0, ech<T> $$1) {
      return $$1.b($$0.c($$1));
   }
}
