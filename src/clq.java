import java.util.Collection;
import javax.annotation.Nullable;

public class clq extends cnb {
   public clq(cnb.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cng $$0) {
      return true;
   }

   @Override
   public boolean a(djp $$0, ctx $$1, hx $$2, cfq $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bkb.a));
      }

      return false;
   }

   @Override
   public bkc a(cpr $$0) {
      cfq $$1 = $$0.o();
      ctx $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         hx $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bkc.e;
         }
      }

      return bkc.a($$2.B);
   }

   private boolean a(cfq $$0, djp $$1, cty $$2, hx $$3, boolean $$4, cng $$5) {
      if (!$$0.gp()) {
         return false;
      } else {
         cwy $$6 = $$1.b();
         djq<cwy, djp> $$7 = $$6.n();
         Collection<dks<?>> $$8 = $$7.d();
         String $$9 = kd.e.b($$6).toString();
         if ($$8.isEmpty()) {
            a($$0, vg.a(this.a() + ".empty", $$9));
            return false;
         } else {
            so $$10 = $$5.a("DebugProperty");
            String $$11 = $$10.l($$9);
            dks<?> $$12 = $$7.a($$11);
            if ($$4) {
               if ($$12 == null) {
                  $$12 = $$8.iterator().next();
               }

               djp $$13 = a($$1, $$12, $$0.fI());
               $$2.a($$3, $$13, 18);
               a($$0, vg.a(this.a() + ".update", $$12.f(), a($$13, $$12)));
            } else {
               $$12 = a($$8, $$12, $$0.fI());
               String $$14 = $$12.f();
               $$10.a($$9, $$14);
               a($$0, vg.a(this.a() + ".select", $$14, a($$1, $$12)));
            }

            return true;
         }
      }
   }

   private static <T extends Comparable<T>> djp a(djp $$0, dks<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cfq $$0, vg $$1) {
      ((anf)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(djp $$0, dks<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
