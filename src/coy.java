import java.util.Collection;
import javax.annotation.Nullable;

public class coy extends cqh {
   public coy(cqh.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cqm $$0) {
      return true;
   }

   @Override
   public boolean a(dnb $$0, cxb $$1, ib $$2, ciu $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bnc.a));
      }

      return false;
   }

   @Override
   public bnd a(csw $$0) {
      ciu $$1 = $$0.o();
      cxb $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         ib $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bnd.e;
         }
      }

      return bnd.a($$2.B);
   }

   private boolean a(ciu $$0, dnb $$1, cxc $$2, ib $$3, boolean $$4, cqm $$5) {
      if (!$$0.gw()) {
         return false;
      } else {
         dac $$6 = $$1.b();
         dnc<dac, dnb> $$7 = $$6.n();
         Collection<doe<?>> $$8 = $$7.d();
         String $$9 = ki.e.b($$6).toString();
         if ($$8.isEmpty()) {
            a($$0, vu.a(this.a() + ".empty", $$9));
            return false;
         } else {
            ta $$10 = $$5.b("DebugProperty");
            String $$11 = $$10.l($$9);
            doe<?> $$12 = $$7.a($$11);
            if ($$4) {
               if ($$12 == null) {
                  $$12 = $$8.iterator().next();
               }

               dnb $$13 = a($$1, $$12, $$0.fO());
               $$2.a($$3, $$13, 18);
               a($$0, vu.a(this.a() + ".update", $$12.f(), a($$13, $$12)));
            } else {
               $$12 = a($$8, $$12, $$0.fO());
               String $$14 = $$12.f();
               $$10.a($$9, $$14);
               a($$0, vu.a(this.a() + ".select", $$14, a($$1, $$12)));
            }

            return true;
         }
      }
   }

   private static <T extends Comparable<T>> dnb a(dnb $$0, doe<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(ciu $$0, vu $$1) {
      ((apg)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dnb $$0, doe<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
