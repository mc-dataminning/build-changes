import java.util.Collection;
import javax.annotation.Nullable;

public class chj extends civ {
   public chj(civ.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cja $$0) {
      return true;
   }

   @Override
   public boolean a(dfe $$0, cpq $$1, gw $$2, cbp $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bgs.a));
      }

      return false;
   }

   @Override
   public bgt a(clk $$0) {
      cbp $$1 = $$0.o();
      cpq $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         gw $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bgt.e;
         }
      }

      return bgt.a($$2.B);
   }

   private boolean a(cbp $$0, dfe $$1, cpr $$2, gw $$3, boolean $$4, cja $$5) {
      if (!$$0.gn()) {
         return false;
      } else {
         csq $$6 = $$1.b();
         dff<csq, dfe> $$7 = $$6.l();
         Collection<dgh<?>> $$8 = $$7.d();
         String $$9 = jd.f.b($$6).toString();
         if ($$8.isEmpty()) {
            a($$0, ti.a(this.a() + ".empty", $$9));
            return false;
         } else {
            qu $$10 = $$5.a("DebugProperty");
            String $$11 = $$10.l($$9);
            dgh<?> $$12 = $$7.a($$11);
            if ($$4) {
               if ($$12 == null) {
                  $$12 = $$8.iterator().next();
               }

               dfe $$13 = a($$1, $$12, $$0.fG());
               $$2.a($$3, $$13, 18);
               a($$0, ti.a(this.a() + ".update", $$12.f(), a($$13, $$12)));
            } else {
               $$12 = a($$8, $$12, $$0.fG());
               String $$14 = $$12.f();
               $$10.a($$9, $$14);
               a($$0, ti.a(this.a() + ".select", $$14, a($$1, $$12)));
            }

            return true;
         }
      }
   }

   private static <T extends Comparable<T>> dfe a(dfe $$0, dgh<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cbp $$0, ti $$1) {
      ((ako)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dfe $$0, dgh<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
