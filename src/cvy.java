import java.util.Collection;
import javax.annotation.Nullable;

public class cvy extends cxc {
   public cvy(cxc.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxo $$0, dgz $$1, jh $$2, cpo $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bsz.a));
      }

      return false;
   }

   @Override
   public bta a(daz $$0) {
      cpo $$1 = $$0.o();
      dgz $$2 = $$0.q();
      if (!$$2.C && $$1 != null) {
         jh $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bta.d;
         }
      }

      return bta.a;
   }

   private boolean a(cpo $$0, dxo $$1, dha $$2, jh $$3, boolean $$4, cxg $$5) {
      if (!$$0.gG()) {
         return false;
      } else {
         jq<dkd> $$6 = $$1.c();
         dxp<dkd, dxo> $$7 = $$6.a().l();
         Collection<dyq<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, xk.a(this.l + ".empty", $$6.g()));
            return false;
         } else {
            czt $$9 = $$5.a(ku.V);
            if ($$9 == null) {
               return false;
            } else {
               dyq<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dxo $$11 = a($$1, $$10, $$0.fY());
                  $$2.a($$3, $$11, 18);
                  a($$0, xk.a(this.l + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fY());
                  $$5.b(ku.V, $$9.a($$6, $$10));
                  a($$0, xk.a(this.l + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dxo a(dxo $$0, dyq<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ae.b($$0, $$1) : ae.a($$0, $$1);
   }

   private static void a(cpo $$0, xk $$1) {
      ((ary)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dxo $$0, dyq<T> $$1) {
      return $$1.b($$0.c($$1));
   }
}
