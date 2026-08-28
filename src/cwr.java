import java.util.Collection;
import javax.annotation.Nullable;

public class cwr extends cxu {
   public cwr(cxu.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cxy $$0, dym $$1, dhp $$2, jj $$3, bwr $$4) {
      if (!$$2.C && $$4 instanceof cqi $$5) {
         this.a($$5, $$1, $$2, $$3, false, $$0);
      }

      return false;
   }

   @Override
   public btq a(dbp $$0) {
      cqi $$1 = $$0.o();
      dhp $$2 = $$0.q();
      if (!$$2.C && $$1 != null) {
         jj $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return btq.d;
         }
      }

      return btq.a;
   }

   private boolean a(cqi $$0, dym $$1, dhq $$2, jj $$3, boolean $$4, cxy $$5) {
      if (!$$0.gF()) {
         return false;
      } else {
         js<dku> $$6 = $$1.c();
         dyn<dku, dym> $$7 = $$6.a().l();
         Collection<dzp<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, wv.a(this.m + ".empty", $$6.g()));
            return false;
         } else {
            dai $$9 = $$5.a(kx.X);
            if ($$9 == null) {
               return false;
            } else {
               dzp<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dym $$11 = a($$1, $$10, $$0.fX());
                  $$2.a($$3, $$11, 18);
                  a($$0, wv.a(this.m + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fX());
                  $$5.b(kx.X, $$9.a($$6, $$10));
                  a($$0, wv.a(this.m + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dym a(dym $$0, dzp<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? af.b($$0, $$1) : af.a($$0, $$1);
   }

   private static void a(cqi $$0, wv $$1) {
      ((aro)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dym $$0, dzp<T> $$1) {
      return $$1.b($$0.c($$1));
   }
}
