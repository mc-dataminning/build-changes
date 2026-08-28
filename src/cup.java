import java.util.Collection;
import javax.annotation.Nullable;

public class cup extends cvt {
   public cup(cvt.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvd $$0, dev $$1, jg $$2, coh $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(brx.a));
      }

      return false;
   }

   @Override
   public bry a(czo $$0) {
      coh $$1 = $$0.o();
      dev $$2 = $$0.q();
      if (!$$2.C && $$1 != null) {
         jg $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bry.d;
         }
      }

      return bry.a;
   }

   private boolean a(coh $$0, dvd $$1, dew $$2, jg $$3, boolean $$4, cvx $$5) {
      if (!$$0.gH()) {
         return false;
      } else {
         jp<dhy> $$6 = $$1.c();
         dve<dhy, dvd> $$7 = $$6.a().l();
         Collection<dwg<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, xh.a(this.k + ".empty", $$6.g()));
            return false;
         } else {
            cyi $$9 = $$5.a(kt.U);
            if ($$9 == null) {
               return false;
            } else {
               dwg<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dvd $$11 = a($$1, $$10, $$0.ga());
                  $$2.a($$3, $$11, 18);
                  a($$0, xh.a(this.k + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.ga());
                  $$5.b(kt.U, $$9.a($$6, $$10));
                  a($$0, xh.a(this.k + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dvd a(dvd $$0, dwg<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ad.b($$0, $$1) : ad.a($$0, $$1);
   }

   private static void a(coh $$0, xh $$1) {
      ((arn)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dvd $$0, dwg<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
