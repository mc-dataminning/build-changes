import java.util.Collection;
import javax.annotation.Nullable;

public class cux extends cwb {
   public cux(cwb.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvo $$0, dff $$1, jh $$2, cor $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bsg.a));
      }

      return false;
   }

   @Override
   public bsh a(czy $$0) {
      cor $$1 = $$0.o();
      dff $$2 = $$0.q();
      if (!$$2.C && $$1 != null) {
         jh $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bsh.d;
         }
      }

      return bsh.a;
   }

   private boolean a(cor $$0, dvo $$1, dfg $$2, jh $$3, boolean $$4, cwf $$5) {
      if (!$$0.gJ()) {
         return false;
      } else {
         jq<dij> $$6 = $$1.c();
         dvp<dij, dvo> $$7 = $$6.a().l();
         Collection<dwq<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, xl.a(this.k + ".empty", $$6.g()));
            return false;
         } else {
            cys $$9 = $$5.a(ku.V);
            if ($$9 == null) {
               return false;
            } else {
               dwq<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dvo $$11 = a($$1, $$10, $$0.gb());
                  $$2.a($$3, $$11, 18);
                  a($$0, xl.a(this.k + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.gb());
                  $$5.b(ku.V, $$9.a($$6, $$10));
                  a($$0, xl.a(this.k + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dvo a(dvo $$0, dwq<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ae.b($$0, $$1) : ae.a($$0, $$1);
   }

   private static void a(cor $$0, xl $$1) {
      ((arr)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dvo $$0, dwq<T> $$1) {
      return $$1.b($$0.c($$1));
   }
}
