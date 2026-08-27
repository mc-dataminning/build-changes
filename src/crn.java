import java.util.Collection;
import javax.annotation.Nullable;

public class crn extends csu {
   public crn(csu.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dqh $$0, dad $$1, in $$2, clh $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bpl.a));
      }

      return false;
   }

   @Override
   public bpm a(cwk $$0) {
      clh $$1 = $$0.o();
      dad $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         in $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bpm.e;
         }
      }

      return bpm.a($$2.B);
   }

   private boolean a(clh $$0, dqh $$1, dae $$2, in $$3, boolean $$4, csz $$5) {
      if (!$$0.gx()) {
         return false;
      } else {
         iw<dde> $$6 = $$1.c();
         dqi<dde, dqh> $$7 = $$6.a().l();
         Collection<drk<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, wu.a(this.a() + ".empty", $$6.g()));
            return false;
         } else {
            cvo $$9 = $$5.a(ka.J);
            if ($$9 == null) {
               return false;
            } else {
               drk<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dqh $$11 = a($$1, $$10, $$0.fP());
                  $$2.a($$3, $$11, 18);
                  a($$0, wu.a(this.a() + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fP());
                  $$5.b(ka.J, $$9.a($$6, $$10));
                  a($$0, wu.a(this.a() + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dqh a(dqh $$0, drk<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(clh $$0, wu $$1) {
      ((aqi)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dqh $$0, drk<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
