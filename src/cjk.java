import java.util.Collection;
import javax.annotation.Nullable;

public class cjk extends ckw {
   public cjk(ckw.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(clb $$0) {
      return true;
   }

   @Override
   public boolean a(dgw $$0, crs $$1, ht $$2, cdm $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bip.a));
      }

      return false;
   }

   @Override
   public biq a(cnl $$0) {
      cdm $$1 = $$0.o();
      crs $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         ht $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return biq.e;
         }
      }

      return biq.a($$2.B);
   }

   private boolean a(cdm $$0, dgw $$1, crt $$2, ht $$3, boolean $$4, clb $$5) {
      if (!$$0.gp()) {
         return false;
      } else {
         cut $$6 = $$1.b();
         dgx<cut, dgw> $$7 = $$6.n();
         Collection<dhz<?>> $$8 = $$7.d();
         String $$9 = jy.f.b($$6).toString();
         if ($$8.isEmpty()) {
            a($$0, ur.a(this.a() + ".empty", $$9));
            return false;
         } else {
            rz $$10 = $$5.a("DebugProperty");
            String $$11 = $$10.l($$9);
            dhz<?> $$12 = $$7.a($$11);
            if ($$4) {
               if ($$12 == null) {
                  $$12 = $$8.iterator().next();
               }

               dgw $$13 = a($$1, $$12, $$0.fI());
               $$2.a($$3, $$13, 18);
               a($$0, ur.a(this.a() + ".update", $$12.f(), a($$13, $$12)));
            } else {
               $$12 = a($$8, $$12, $$0.fI());
               String $$14 = $$12.f();
               $$10.a($$9, $$14);
               a($$0, ur.a(this.a() + ".select", $$14, a($$1, $$12)));
            }

            return true;
         }
      }
   }

   private static <T extends Comparable<T>> dgw a(dgw $$0, dhz<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cdm $$0, ur $$1) {
      ((amb)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dgw $$0, dhz<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
