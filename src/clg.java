import java.util.Collection;
import javax.annotation.Nullable;

public class clg extends cms {
   public clg(cms.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cmx $$0) {
      return true;
   }

   @Override
   public boolean a(djg $$0, cto $$1, hx $$2, cfh $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bjz.a));
      }

      return false;
   }

   @Override
   public bka a(cpi $$0) {
      cfh $$1 = $$0.o();
      cto $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         hx $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bka.e;
         }
      }

      return bka.a($$2.B);
   }

   private boolean a(cfh $$0, djg $$1, ctp $$2, hx $$3, boolean $$4, cmx $$5) {
      if (!$$0.gp()) {
         return false;
      } else {
         cwp $$6 = $$1.b();
         djh<cwp, djg> $$7 = $$6.n();
         Collection<dkj<?>> $$8 = $$7.d();
         String $$9 = kd.e.b($$6).toString();
         if ($$8.isEmpty()) {
            a($$0, vf.a(this.a() + ".empty", $$9));
            return false;
         } else {
            sn $$10 = $$5.a("DebugProperty");
            String $$11 = $$10.l($$9);
            dkj<?> $$12 = $$7.a($$11);
            if ($$4) {
               if ($$12 == null) {
                  $$12 = $$8.iterator().next();
               }

               djg $$13 = a($$1, $$12, $$0.fI());
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

   private static <T extends Comparable<T>> djg a(djg $$0, dkj<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cfh $$0, vf $$1) {
      ((ane)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(djg $$0, dkj<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
