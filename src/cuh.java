import java.util.Collection;
import javax.annotation.Nullable;

public class cuh extends cvn {
   public cuh(cvn.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dus $$0, dej $$1, jf $$2, cnx $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(brr.a));
      }

      return false;
   }

   @Override
   public brs a(czp $$0) {
      cnx $$1 = $$0.o();
      dej $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         jf $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return brs.d;
         }
      }

      return brs.a;
   }

   private boolean a(cnx $$0, dus $$1, dek $$2, jf $$3, boolean $$4, cvs $$5) {
      if (!$$0.gA()) {
         return false;
      } else {
         jo<dhm> $$6 = $$1.c();
         dut<dhm, dus> $$7 = $$6.a().k();
         Collection<dvv<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, xe.a(this.a() + ".empty", $$6.g()));
            return false;
         } else {
            cyj $$9 = $$5.a(ks.Q);
            if ($$9 == null) {
               return false;
            } else {
               dvv<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dus $$11 = a($$1, $$10, $$0.fT());
                  $$2.a($$3, $$11, 18);
                  a($$0, xe.a(this.a() + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fT());
                  $$5.b(ks.Q, $$9.a($$6, $$10));
                  a($$0, xe.a(this.a() + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dus a(dus $$0, dvv<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ad.b($$0, $$1) : ad.a($$0, $$1);
   }

   private static void a(cnx $$0, xe $$1) {
      ((ark)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dus $$0, dvv<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
