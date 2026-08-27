import java.util.Collection;
import javax.annotation.Nullable;

public class cqr extends cry {
   public cqr(cry.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpy $$0, czu $$1, im $$2, ckl $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bop.a));
      }

      return false;
   }

   @Override
   public boq a(cvn $$0) {
      ckl $$1 = $$0.o();
      czu $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         im $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return boq.e;
         }
      }

      return boq.a($$2.B);
   }

   private boolean a(ckl $$0, dpy $$1, czv $$2, im $$3, boolean $$4, csd $$5) {
      if (!$$0.gx()) {
         return false;
      } else {
         iv<dcv> $$6 = $$1.c();
         dpz<dcv, dpy> $$7 = $$6.a().l();
         Collection<drb<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, ws.a(this.a() + ".empty", $$6.g()));
            return false;
         } else {
            cus $$9 = $$5.a(jz.C);
            if ($$9 == null) {
               return false;
            } else {
               drb<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dpy $$11 = a($$1, $$10, $$0.fP());
                  $$2.a($$3, $$11, 18);
                  a($$0, ws.a(this.a() + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fP());
                  $$5.b(jz.C, $$9.a($$6, $$10));
                  a($$0, ws.a(this.a() + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dpy a(dpy $$0, drb<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(ckl $$0, ws $$1) {
      ((aqf)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dpy $$0, drb<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
