import java.util.Collection;
import javax.annotation.Nullable;

public class cwh extends cxl {
   public cwh(cxl.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxv $$0, dhi $$1, jh $$2, cpx $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bti.a));
      }

      return false;
   }

   @Override
   public btj a(dbi $$0) {
      cpx $$1 = $$0.o();
      dhi $$2 = $$0.q();
      if (!$$2.C && $$1 != null) {
         jh $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return btj.d;
         }
      }

      return btj.a;
   }

   private boolean a(cpx $$0, dxv $$1, dhj $$2, jh $$3, boolean $$4, cxp $$5) {
      if (!$$0.gG()) {
         return false;
      } else {
         jq<dkm> $$6 = $$1.c();
         dxw<dkm, dxv> $$7 = $$6.a().l();
         Collection<dyx<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, xv.a(this.l + ".empty", $$6.g()));
            return false;
         } else {
            dac $$9 = $$5.a(ku.V);
            if ($$9 == null) {
               return false;
            } else {
               dyx<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dxv $$11 = a($$1, $$10, $$0.fY());
                  $$2.a($$3, $$11, 18);
                  a($$0, xv.a(this.l + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fY());
                  $$5.b(ku.V, $$9.a($$6, $$10));
                  a($$0, xv.a(this.l + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dxv a(dxv $$0, dyx<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ae.b($$0, $$1) : ae.a($$0, $$1);
   }

   private static void a(cpx $$0, xv $$1) {
      ((asi)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dxv $$0, dyx<T> $$1) {
      return $$1.b($$0.c($$1));
   }
}
