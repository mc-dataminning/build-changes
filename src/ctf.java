import java.util.Collection;
import javax.annotation.Nullable;

public class ctf extends cum {
   public ctf(cum.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dse $$0, dca $$1, iz $$2, cmz $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bqv.a));
      }

      return false;
   }

   @Override
   public bqw a(cye $$0) {
      cmz $$1 = $$0.o();
      dca $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         iz $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bqw.f;
         }
      }

      return bqw.a($$2.B);
   }

   private boolean a(cmz $$0, dse $$1, dcb $$2, iz $$3, boolean $$4, cur $$5) {
      if (!$$0.gz()) {
         return false;
      } else {
         ji<dfb> $$6 = $$1.c();
         dsf<dfb, dse> $$7 = $$6.a().l();
         Collection<dth<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, xp.a(this.a() + ".empty", $$6.g()));
            return false;
         } else {
            cxi $$9 = $$5.a(km.L);
            if ($$9 == null) {
               return false;
            } else {
               dth<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dse $$11 = a($$1, $$10, $$0.fR());
                  $$2.a($$3, $$11, 18);
                  a($$0, xp.a(this.a() + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fR());
                  $$5.b(km.L, $$9.a($$6, $$10));
                  a($$0, xp.a(this.a() + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dse a(dse $$0, dth<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cmz $$0, xp $$1) {
      ((arg)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dse $$0, dth<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
