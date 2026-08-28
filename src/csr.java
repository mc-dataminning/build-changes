import java.util.Collection;
import javax.annotation.Nullable;

public class csr extends cty {
   public csr(cty.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dsl $$0, dcg $$1, ja $$2, cml $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bqg.a));
      }

      return false;
   }

   @Override
   public bqh a(cxp $$0) {
      cml $$1 = $$0.o();
      dcg $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         ja $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bqh.f;
         }
      }

      return bqh.a($$2.B);
   }

   private boolean a(cml $$0, dsl $$1, dch $$2, ja $$3, boolean $$4, cud $$5) {
      if (!$$0.gx()) {
         return false;
      } else {
         jj<dfi> $$6 = $$1.c();
         dsm<dfi, dsl> $$7 = $$6.a().l();
         Collection<dto<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, wu.a(this.a() + ".empty", $$6.g()));
            return false;
         } else {
            cwt $$9 = $$5.a(kn.L);
            if ($$9 == null) {
               return false;
            } else {
               dto<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dsl $$11 = a($$1, $$10, $$0.fP());
                  $$2.a($$3, $$11, 18);
                  a($$0, wu.a(this.a() + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fP());
                  $$5.b(kn.L, $$9.a($$6, $$10));
                  a($$0, wu.a(this.a() + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dsl a(dsl $$0, dto<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cml $$0, wu $$1) {
      ((aqn)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dsl $$0, dto<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
