import java.util.Collection;
import javax.annotation.Nullable;

public class cvh extends cwl {
   public cvh(cwl.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dwx $$0, dgi $$1, ji $$2, cox $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bsj.a));
      }

      return false;
   }

   @Override
   public bsk a(dai $$0) {
      cox $$1 = $$0.o();
      dgi $$2 = $$0.q();
      if (!$$2.C && $$1 != null) {
         ji $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bsk.d;
         }
      }

      return bsk.a;
   }

   private boolean a(cox $$0, dwx $$1, dgj $$2, ji $$3, boolean $$4, cwp $$5) {
      if (!$$0.gG()) {
         return false;
      } else {
         jr<djm> $$6 = $$1.c();
         dwy<djm, dwx> $$7 = $$6.a().l();
         Collection<dxz<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, wp.a(this.l + ".empty", $$6.g()));
            return false;
         } else {
            czc $$9 = $$5.a(kv.V);
            if ($$9 == null) {
               return false;
            } else {
               dxz<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dwx $$11 = a($$1, $$10, $$0.fY());
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

   private static <T extends Comparable<T>> dwx a(dwx $$0, dxz<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? af.b($$0, $$1) : af.a($$0, $$1);
   }

   private static void a(cox $$0, wp $$1) {
      ((are)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dwx $$0, dxz<T> $$1) {
      return $$1.b($$0.c($$1));
   }
}
