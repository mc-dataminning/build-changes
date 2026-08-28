import java.util.Collection;
import javax.annotation.Nullable;

public class cyh extends czj {
   public cyh(czj.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(czn $$0, eat $$1, djm $$2, iv $$3, bxj $$4) {
      if (!$$2.C && $$4 instanceof crm $$5) {
         this.a($$5, $$1, $$2, $$3, false, $$0);
      }

      return false;
   }

   @Override
   public bug a(ddi $$0) {
      crm $$1 = $$0.o();
      djm $$2 = $$0.q();
      if (!$$2.C && $$1 != null) {
         iv $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bug.d;
         }
      }

      return bug.a;
   }

   private boolean a(crm $$0, eat $$1, djn $$2, iv $$3, boolean $$4, czn $$5) {
      if (!$$0.gF()) {
         return false;
      } else {
         jf<dmr> $$6 = $$1.c();
         eau<dmr, eat> $$7 = $$6.a().l();
         Collection<ebw<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, wy.a(this.n + ".empty", $$6.g()));
            return false;
         } else {
            dbz $$9 = $$5.a(kk.X);
            if ($$9 == null) {
               return false;
            } else {
               ebw<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  eat $$11 = a($$1, $$10, $$0.fX());
                  $$2.a($$3, $$11, 18);
                  a($$0, wy.a(this.n + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fX());
                  $$5.b(kk.X, $$9.a($$6, $$10));
                  a($$0, wy.a(this.n + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> eat a(eat $$0, ebw<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ag.b($$0, $$1) : ag.a($$0, $$1);
   }

   private static void a(crm $$0, wy $$1) {
      ((arr)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(eat $$0, ebw<T> $$1) {
      return $$1.b($$0.c($$1));
   }
}
