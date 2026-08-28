import java.util.Collection;
import javax.annotation.Nullable;

public class csy extends cuf {
   public csy(cuf.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(drx $$0, dbt $$1, iz $$2, cms $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bqo.a));
      }

      return false;
   }

   @Override
   public bqp a(cxx $$0) {
      cms $$1 = $$0.o();
      dbt $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         iz $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bqp.f;
         }
      }

      return bqp.a($$2.B);
   }

   private boolean a(cms $$0, drx $$1, dbu $$2, iz $$3, boolean $$4, cuk $$5) {
      if (!$$0.gz()) {
         return false;
      } else {
         ji<deu> $$6 = $$1.c();
         dry<deu, drx> $$7 = $$6.a().l();
         Collection<dta<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, xl.a(this.a() + ".empty", $$6.g()));
            return false;
         } else {
            cxb $$9 = $$5.a(km.K);
            if ($$9 == null) {
               return false;
            } else {
               dta<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  drx $$11 = a($$1, $$10, $$0.fR());
                  $$2.a($$3, $$11, 18);
                  a($$0, xl.a(this.a() + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fR());
                  $$5.b(km.K, $$9.a($$6, $$10));
                  a($$0, xl.a(this.a() + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> drx a(drx $$0, dta<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cms $$0, xl $$1) {
      ((arc)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(drx $$0, dta<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
