import java.util.Collection;
import javax.annotation.Nullable;

public class chf extends cir {
   public chf(cir.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(ciw $$0) {
      return true;
   }

   @Override
   public boolean a(dey $$0, cpk $$1, gv $$2, cbl $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bgn.a));
      }

      return false;
   }

   @Override
   public bgo a(clg $$0) {
      cbl $$1 = $$0.o();
      cpk $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         gv $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bgo.e;
         }
      }

      return bgo.a($$2.B);
   }

   private boolean a(cbl $$0, dey $$1, cpl $$2, gv $$3, boolean $$4, ciw $$5) {
      if (!$$0.gn()) {
         return false;
      } else {
         csk $$6 = $$1.b();
         dez<csk, dey> $$7 = $$6.l();
         Collection<dgb<?>> $$8 = $$7.d();
         String $$9 = jc.f.b($$6).toString();
         if ($$8.isEmpty()) {
            a($$0, te.a(this.a() + ".empty", $$9));
            return false;
         } else {
            qs $$10 = $$5.a("DebugProperty");
            String $$11 = $$10.l($$9);
            dgb<?> $$12 = $$7.a($$11);
            if ($$4) {
               if ($$12 == null) {
                  $$12 = $$8.iterator().next();
               }

               dey $$13 = a($$1, $$12, $$0.fG());
               $$2.a($$3, $$13, 18);
               a($$0, te.a(this.a() + ".update", $$12.f(), a($$13, $$12)));
            } else {
               $$12 = a($$8, $$12, $$0.fG());
               String $$14 = $$12.f();
               $$10.a($$9, $$14);
               a($$0, te.a(this.a() + ".select", $$14, a($$1, $$12)));
            }

            return true;
         }
      }
   }

   private static <T extends Comparable<T>> dey a(dey $$0, dgb<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cbl $$0, te $$1) {
      ((akj)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dey $$0, dgb<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
