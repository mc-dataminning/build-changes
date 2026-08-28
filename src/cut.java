import java.util.Collection;
import javax.annotation.Nullable;

public class cut extends cvx {
   public cut(cvx.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvj $$0, dfb $$1, jh $$2, com $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bsc.a));
      }

      return false;
   }

   @Override
   public bsd a(czu $$0) {
      com $$1 = $$0.o();
      dfb $$2 = $$0.q();
      if (!$$2.C && $$1 != null) {
         jh $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bsd.d;
         }
      }

      return bsd.a;
   }

   private boolean a(com $$0, dvj $$1, dfc $$2, jh $$3, boolean $$4, cwb $$5) {
      if (!$$0.gH()) {
         return false;
      } else {
         jq<die> $$6 = $$1.c();
         dvk<die, dvj> $$7 = $$6.a().l();
         Collection<dwm<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, xi.a(this.k + ".empty", $$6.g()));
            return false;
         } else {
            cyo $$9 = $$5.a(ku.V);
            if ($$9 == null) {
               return false;
            } else {
               dwm<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dvj $$11 = a($$1, $$10, $$0.ga());
                  $$2.a($$3, $$11, 18);
                  a($$0, xi.a(this.k + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.ga());
                  $$5.b(ku.V, $$9.a($$6, $$10));
                  a($$0, xi.a(this.k + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dvj a(dvj $$0, dwm<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ae.b($$0, $$1) : ae.a($$0, $$1);
   }

   private static void a(com $$0, xi $$1) {
      ((aro)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dvj $$0, dwm<T> $$1) {
      return $$1.b($$0.c($$1));
   }
}
