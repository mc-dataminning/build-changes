import java.util.Collection;
import javax.annotation.Nullable;

public class cxs extends cyu {
   public cxs(cyu.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cyy $$0, dzz $$1, div $$2, iu $$3, bxc $$4) {
      if (!$$2.C && $$4 instanceof cqy $$5) {
         this.a($$5, $$1, $$2, $$3, false, $$0);
      }

      return false;
   }

   @Override
   public bub a(dct $$0) {
      cqy $$1 = $$0.o();
      div $$2 = $$0.q();
      if (!$$2.C && $$1 != null) {
         iu $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bub.d;
         }
      }

      return bub.a;
   }

   private boolean a(cqy $$0, dzz $$1, diw $$2, iu $$3, boolean $$4, cyy $$5) {
      if (!$$0.gF()) {
         return false;
      } else {
         je<dma> $$6 = $$1.c();
         eaa<dma, dzz> $$7 = $$6.a().l();
         Collection<ebc<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, wy.a(this.n + ".empty", $$6.g()));
            return false;
         } else {
            dbk $$9 = $$5.a(kj.X);
            if ($$9 == null) {
               return false;
            } else {
               ebc<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dzz $$11 = a($$1, $$10, $$0.fX());
                  $$2.a($$3, $$11, 18);
                  a($$0, wy.a(this.n + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fX());
                  $$5.b(kj.X, $$9.a($$6, $$10));
                  a($$0, wy.a(this.n + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dzz a(dzz $$0, ebc<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? af.b($$0, $$1) : af.a($$0, $$1);
   }

   private static void a(cqy $$0, wy $$1) {
      ((arr)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dzz $$0, ebc<T> $$1) {
      return $$1.b($$0.c($$1));
   }
}
