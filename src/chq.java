import java.util.Collection;
import javax.annotation.Nullable;

public class chq extends cjc {
   public chq(cjc.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cjh $$0) {
      return true;
   }

   @Override
   public boolean a(dfl $$0, cpx $$1, gw $$2, cbw $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bgz.a));
      }

      return false;
   }

   @Override
   public bha a(clr $$0) {
      cbw $$1 = $$0.o();
      cpx $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         gw $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bha.e;
         }
      }

      return bha.a($$2.B);
   }

   private boolean a(cbw $$0, dfl $$1, cpy $$2, gw $$3, boolean $$4, cjh $$5) {
      if (!$$0.go()) {
         return false;
      } else {
         csx $$6 = $$1.b();
         dfm<csx, dfl> $$7 = $$6.l();
         Collection<dgo<?>> $$8 = $$7.d();
         String $$9 = jd.f.b($$6).toString();
         if ($$8.isEmpty()) {
            a($$0, tn.a(this.a() + ".empty", $$9));
            return false;
         } else {
            qy $$10 = $$5.a("DebugProperty");
            String $$11 = $$10.l($$9);
            dgo<?> $$12 = $$7.a($$11);
            if ($$4) {
               if ($$12 == null) {
                  $$12 = $$8.iterator().next();
               }

               dfl $$13 = a($$1, $$12, $$0.fH());
               $$2.a($$3, $$13, 18);
               a($$0, tn.a(this.a() + ".update", $$12.f(), a($$13, $$12)));
            } else {
               $$12 = a($$8, $$12, $$0.fH());
               String $$14 = $$12.f();
               $$10.a($$9, $$14);
               a($$0, tn.a(this.a() + ".select", $$14, a($$1, $$12)));
            }

            return true;
         }
      }
   }

   private static <T extends Comparable<T>> dfl a(dfl $$0, dgo<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cbw $$0, tn $$1) {
      ((akt)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dfl $$0, dgo<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
