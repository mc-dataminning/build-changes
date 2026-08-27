import java.util.Collection;
import javax.annotation.Nullable;

public class chg extends cis {
   public chg(cis.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cix $$0) {
      return true;
   }

   @Override
   public boolean a(dez $$0, cpl $$1, gu $$2, cbm $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bgp.a));
      }

      return false;
   }

   @Override
   public bgq a(clh $$0) {
      cbm $$1 = $$0.o();
      cpl $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         gu $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bgq.e;
         }
      }

      return bgq.a($$2.B);
   }

   private boolean a(cbm $$0, dez $$1, cpm $$2, gu $$3, boolean $$4, cix $$5) {
      if (!$$0.gn()) {
         return false;
      } else {
         csl $$6 = $$1.b();
         dfa<csl, dez> $$7 = $$6.l();
         Collection<dgc<?>> $$8 = $$7.d();
         String $$9 = jb.f.b($$6).toString();
         if ($$8.isEmpty()) {
            a($$0, tf.a(this.a() + ".empty", $$9));
            return false;
         } else {
            qr $$10 = $$5.a("DebugProperty");
            String $$11 = $$10.l($$9);
            dgc<?> $$12 = $$7.a($$11);
            if ($$4) {
               if ($$12 == null) {
                  $$12 = $$8.iterator().next();
               }

               dez $$13 = a($$1, $$12, $$0.fG());
               $$2.a($$3, $$13, 18);
               a($$0, tf.a(this.a() + ".update", $$12.f(), a($$13, $$12)));
            } else {
               $$12 = a($$8, $$12, $$0.fG());
               String $$14 = $$12.f();
               $$10.a($$9, $$14);
               a($$0, tf.a(this.a() + ".select", $$14, a($$1, $$12)));
            }

            return true;
         }
      }
   }

   private static <T extends Comparable<T>> dez a(dez $$0, dgc<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cbm $$0, tf $$1) {
      ((akl)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dez $$0, dgc<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
