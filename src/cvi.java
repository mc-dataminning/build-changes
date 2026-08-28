import java.util.Collection;
import javax.annotation.Nullable;

public class cvi extends cwm {
   public cvi(cwm.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dwy $$0, dgj $$1, ji $$2, coy $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bsk.a));
      }

      return false;
   }

   @Override
   public bsl a(daj $$0) {
      coy $$1 = $$0.o();
      dgj $$2 = $$0.q();
      if (!$$2.C && $$1 != null) {
         ji $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bsl.d;
         }
      }

      return bsl.a;
   }

   private boolean a(coy $$0, dwy $$1, dgk $$2, ji $$3, boolean $$4, cwq $$5) {
      if (!$$0.gG()) {
         return false;
      } else {
         jr<djn> $$6 = $$1.c();
         dwz<djn, dwy> $$7 = $$6.a().l();
         Collection<dya<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, wp.a(this.l + ".empty", $$6.g()));
            return false;
         } else {
            czd $$9 = $$5.a(kv.V);
            if ($$9 == null) {
               return false;
            } else {
               dya<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dwy $$11 = a($$1, $$10, $$0.fY());
                  $$2.a($$3, $$11, 18);
                  a($$0, wp.a(this.l + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fY());
                  $$5.b(kv.V, $$9.a($$6, $$10));
                  a($$0, wp.a(this.l + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dwy a(dwy $$0, dya<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? af.b($$0, $$1) : af.a($$0, $$1);
   }

   private static void a(coy $$0, wp $$1) {
      ((are)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dwy $$0, dya<T> $$1) {
      return $$1.b($$0.c($$1));
   }
}
