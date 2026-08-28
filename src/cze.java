import java.util.Collection;
import javax.annotation.Nullable;

public class cze extends dag {
   public cze(dag.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dak $$0, ebq $$1, dkj $$2, iw $$3, byf $$4) {
      if (!$$2.C && $$4 instanceof csi $$5) {
         this.a($$5, $$1, $$2, $$3, false, $$0);
      }

      return false;
   }

   @Override
   public bvc a(def $$0) {
      csi $$1 = $$0.o();
      dkj $$2 = $$0.q();
      if (!$$2.C && $$1 != null) {
         iw $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bvc.d;
         }
      }

      return bvc.a;
   }

   private boolean a(csi $$0, ebq $$1, dkk $$2, iw $$3, boolean $$4, dak $$5) {
      if (!$$0.gG()) {
         return false;
      } else {
         jg<dno> $$6 = $$1.c();
         ebr<dno, ebq> $$7 = $$6.a().l();
         Collection<ect<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, xg.a(this.n + ".empty", $$6.g()));
            return false;
         } else {
            dcw $$9 = $$5.a(kl.X);
            if ($$9 == null) {
               return false;
            } else {
               ect<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  ebq $$11 = a($$1, $$10, $$0.fY());
                  $$2.a($$3, $$11, 18);
                  a($$0, xg.a(this.n + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fY());
                  $$5.b(kl.X, $$9.a($$6, $$10));
                  a($$0, xg.a(this.n + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> ebq a(ebq $$0, ect<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ag.b($$0, $$1) : ag.a($$0, $$1);
   }

   private static void a(csi $$0, xg $$1) {
      ((asc)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(ebq $$0, ect<T> $$1) {
      return $$1.b($$0.c($$1));
   }
}
