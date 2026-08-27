import java.util.Collection;
import javax.annotation.Nullable;

public class cpx extends cre {
   public cpx(cre.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(doz $$0, cyx $$1, ib $$2, cjt $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bnz.a));
      }

      return false;
   }

   @Override
   public boa a(cuq $$0) {
      cjt $$1 = $$0.o();
      cyx $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         ib $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return boa.e;
         }
      }

      return boa.a($$2.B);
   }

   private boolean a(cjt $$0, doz $$1, cyy $$2, ib $$3, boolean $$4, crj $$5) {
      if (!$$0.gw()) {
         return false;
      } else {
         il<dby> $$6 = $$1.c();
         dpa<dby, doz> $$7 = $$6.a().l();
         Collection<dqc<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, wg.a(this.a() + ".empty", $$6.g()));
            return false;
         } else {
            ctv $$9 = $$5.a(jp.C);
            if ($$9 == null) {
               return false;
            } else {
               dqc<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  doz $$11 = a($$1, $$10, $$0.fO());
                  $$2.a($$3, $$11, 18);
                  a($$0, wg.a(this.a() + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fO());
                  $$5.b(jp.C, $$9.a($$6, $$10));
                  a($$0, wg.a(this.a() + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> doz a(doz $$0, dqc<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cjt $$0, wg $$1) {
      ((apt)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(doz $$0, dqc<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
