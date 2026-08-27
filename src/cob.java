import java.util.Collection;
import javax.annotation.Nullable;

public class cob extends cpl {
   public cob(cpl.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cpq $$0) {
      return true;
   }

   @Override
   public boolean a(dme $$0, cwe $$1, ib $$2, cia $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bmk.a));
      }

      return false;
   }

   @Override
   public bml a(crz $$0) {
      cia $$1 = $$0.o();
      cwe $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         ib $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bml.e;
         }
      }

      return bml.a($$2.B);
   }

   private boolean a(cia $$0, dme $$1, cwf $$2, ib $$3, boolean $$4, cpq $$5) {
      if (!$$0.gs()) {
         return false;
      } else {
         czf $$6 = $$1.b();
         dmf<czf, dme> $$7 = $$6.n();
         Collection<dnh<?>> $$8 = $$7.d();
         String $$9 = kh.e.b($$6).toString();
         if ($$8.isEmpty()) {
            a($$0, vs.a(this.a() + ".empty", $$9));
            return false;
         } else {
            sy $$10 = $$5.b("DebugProperty");
            String $$11 = $$10.l($$9);
            dnh<?> $$12 = $$7.a($$11);
            if ($$4) {
               if ($$12 == null) {
                  $$12 = $$8.iterator().next();
               }

               dme $$13 = a($$1, $$12, $$0.fK());
               $$2.a($$3, $$13, 18);
               a($$0, vs.a(this.a() + ".update", $$12.f(), a($$13, $$12)));
            } else {
               $$12 = a($$8, $$12, $$0.fK());
               String $$14 = $$12.f();
               $$10.a($$9, $$14);
               a($$0, vs.a(this.a() + ".select", $$14, a($$1, $$12)));
            }

            return true;
         }
      }
   }

   private static <T extends Comparable<T>> dme a(dme $$0, dnh<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cia $$0, vs $$1) {
      ((apb)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dme $$0, dnh<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
