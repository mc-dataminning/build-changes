import java.util.Collection;
import javax.annotation.Nullable;

public class cwg extends cxk {
   public cwg(cxk.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxu $$0, dhh $$1, jh $$2, cpw $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bth.a));
      }

      return false;
   }

   @Override
   public bti a(dbh $$0) {
      cpw $$1 = $$0.o();
      dhh $$2 = $$0.q();
      if (!$$2.C && $$1 != null) {
         jh $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bti.d;
         }
      }

      return bti.a;
   }

   private boolean a(cpw $$0, dxu $$1, dhi $$2, jh $$3, boolean $$4, cxo $$5) {
      if (!$$0.gG()) {
         return false;
      } else {
         jq<dkl> $$6 = $$1.c();
         dxv<dkl, dxu> $$7 = $$6.a().l();
         Collection<dyw<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, xv.a(this.l + ".empty", $$6.g()));
            return false;
         } else {
            dab $$9 = $$5.a(ku.V);
            if ($$9 == null) {
               return false;
            } else {
               dyw<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dxu $$11 = a($$1, $$10, $$0.fY());
                  $$2.a($$3, $$11, 18);
                  a($$0, xv.a(this.l + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fY());
                  $$5.b(ku.V, $$9.a($$6, $$10));
                  a($$0, xv.a(this.l + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dxu a(dxu $$0, dyw<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ae.b($$0, $$1) : ae.a($$0, $$1);
   }

   private static void a(cpw $$0, xv $$1) {
      ((asi)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dxu $$0, dyw<T> $$1) {
      return $$1.b($$0.c($$1));
   }
}
