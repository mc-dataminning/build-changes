import java.util.Collection;
import javax.annotation.Nullable;

public class ctb extends cui {
   public ctb(cui.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dsa $$0, dbw $$1, iz $$2, cmv $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bqr.a));
      }

      return false;
   }

   @Override
   public bqs a(cya $$0) {
      cmv $$1 = $$0.o();
      dbw $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         iz $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bqs.f;
         }
      }

      return bqs.a($$2.B);
   }

   private boolean a(cmv $$0, dsa $$1, dbx $$2, iz $$3, boolean $$4, cun $$5) {
      if (!$$0.gz()) {
         return false;
      } else {
         ji<dex> $$6 = $$1.c();
         dsb<dex, dsa> $$7 = $$6.a().l();
         Collection<dtd<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, xo.a(this.a() + ".empty", $$6.g()));
            return false;
         } else {
            cxe $$9 = $$5.a(km.K);
            if ($$9 == null) {
               return false;
            } else {
               dtd<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dsa $$11 = a($$1, $$10, $$0.fR());
                  $$2.a($$3, $$11, 18);
                  a($$0, xo.a(this.a() + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fR());
                  $$5.b(km.K, $$9.a($$6, $$10));
                  a($$0, xo.a(this.a() + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dsa a(dsa $$0, dtd<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cmv $$0, xo $$1) {
      ((arf)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dsa $$0, dtd<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
