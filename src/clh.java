import java.util.Collection;
import javax.annotation.Nullable;

public class clh extends cmt {
   public clh(cmt.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cmy $$0) {
      return true;
   }

   @Override
   public boolean a(djh $$0, ctp $$1, hx $$2, cfi $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bka.a));
      }

      return false;
   }

   @Override
   public bkb a(cpj $$0) {
      cfi $$1 = $$0.o();
      ctp $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         hx $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bkb.e;
         }
      }

      return bkb.a($$2.B);
   }

   private boolean a(cfi $$0, djh $$1, ctq $$2, hx $$3, boolean $$4, cmy $$5) {
      if (!$$0.gp()) {
         return false;
      } else {
         cwq $$6 = $$1.b();
         dji<cwq, djh> $$7 = $$6.n();
         Collection<dkk<?>> $$8 = $$7.d();
         String $$9 = kd.e.b($$6).toString();
         if ($$8.isEmpty()) {
            a($$0, vf.a(this.a() + ".empty", $$9));
            return false;
         } else {
            sn $$10 = $$5.a("DebugProperty");
            String $$11 = $$10.l($$9);
            dkk<?> $$12 = $$7.a($$11);
            if ($$4) {
               if ($$12 == null) {
                  $$12 = $$8.iterator().next();
               }

               djh $$13 = a($$1, $$12, $$0.fI());
               $$2.a($$3, $$13, 18);
               a($$0, vf.a(this.a() + ".update", $$12.f(), a($$13, $$12)));
            } else {
               $$12 = a($$8, $$12, $$0.fI());
               String $$14 = $$12.f();
               $$10.a($$9, $$14);
               a($$0, vf.a(this.a() + ".select", $$14, a($$1, $$12)));
            }

            return true;
         }
      }
   }

   private static <T extends Comparable<T>> djh a(djh $$0, dkk<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cfi $$0, vf $$1) {
      ((ane)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(djh $$0, dkk<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
