import java.util.Collection;
import javax.annotation.Nullable;

public class cxm extends cyo {
   public cxm(cyo.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cys $$0, dzo $$1, dip $$2, iu $$3, bwz $$4) {
      if (!$$2.C && $$4 instanceof cqs $$5) {
         this.a($$5, $$1, $$2, $$3, false, $$0);
      }

      return false;
   }

   @Override
   public bty a(dcn $$0) {
      cqs $$1 = $$0.o();
      dip $$2 = $$0.q();
      if (!$$2.C && $$1 != null) {
         iu $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bty.d;
         }
      }

      return bty.a;
   }

   private boolean a(cqs $$0, dzo $$1, diq $$2, iu $$3, boolean $$4, cys $$5) {
      if (!$$0.gF()) {
         return false;
      } else {
         je<dlu> $$6 = $$1.c();
         dzp<dlu, dzo> $$7 = $$6.a().l();
         Collection<ear<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, ww.a(this.n + ".empty", $$6.g()));
            return false;
         } else {
            dbe $$9 = $$5.a(kj.X);
            if ($$9 == null) {
               return false;
            } else {
               ear<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dzo $$11 = a($$1, $$10, $$0.fX());
                  $$2.a($$3, $$11, 18);
                  a($$0, ww.a(this.n + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fX());
                  $$5.b(kj.X, $$9.a($$6, $$10));
                  a($$0, ww.a(this.n + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dzo a(dzo $$0, ear<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? af.b($$0, $$1) : af.a($$0, $$1);
   }

   private static void a(cqs $$0, ww $$1) {
      ((arp)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dzo $$0, ear<T> $$1) {
      return $$1.b($$0.c($$1));
   }
}
