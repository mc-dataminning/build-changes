import java.util.Collection;
import javax.annotation.Nullable;

public class cnm extends coy {
   public cnm(coy.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cpd $$0) {
      return true;
   }

   @Override
   public boolean a(dlj $$0, cvr $$1, hz $$2, chl $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(blv.a));
      }

      return false;
   }

   @Override
   public blw a(crm $$0) {
      chl $$1 = $$0.o();
      cvr $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         hz $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return blw.e;
         }
      }

      return blw.a($$2.B);
   }

   private boolean a(chl $$0, dlj $$1, cvs $$2, hz $$3, boolean $$4, cpd $$5) {
      if (!$$0.gq()) {
         return false;
      } else {
         cys $$6 = $$1.b();
         dlk<cys, dlj> $$7 = $$6.n();
         Collection<dmm<?>> $$8 = $$7.d();
         String $$9 = kf.e.b($$6).toString();
         if ($$8.isEmpty()) {
            a($$0, vq.a(this.a() + ".empty", $$9));
            return false;
         } else {
            sw $$10 = $$5.a("DebugProperty");
            String $$11 = $$10.l($$9);
            dmm<?> $$12 = $$7.a($$11);
            if ($$4) {
               if ($$12 == null) {
                  $$12 = $$8.iterator().next();
               }

               dlj $$13 = a($$1, $$12, $$0.fI());
               $$2.a($$3, $$13, 18);
               a($$0, vq.a(this.a() + ".update", $$12.f(), a($$13, $$12)));
            } else {
               $$12 = a($$8, $$12, $$0.fI());
               String $$14 = $$12.f();
               $$10.a($$9, $$14);
               a($$0, vq.a(this.a() + ".select", $$14, a($$1, $$12)));
            }

            return true;
         }
      }
   }

   private static <T extends Comparable<T>> dlj a(dlj $$0, dmm<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(chl $$0, vq $$1) {
      ((aox)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dlj $$0, dmm<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
