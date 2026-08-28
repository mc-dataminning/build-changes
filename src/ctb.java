import java.util.Collection;
import javax.annotation.Nullable;

public class ctb extends cuj {
   public ctb(cuj.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dta $$0, dcu $$1, jd $$2, cmv $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bqp.a));
      }

      return false;
   }

   @Override
   public bqq a(cyd $$0) {
      cmv $$1 = $$0.o();
      dcu $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         jd $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bqq.f;
         }
      }

      return bqq.a($$2.B);
   }

   private boolean a(cmv $$0, dta $$1, dcv $$2, jd $$3, boolean $$4, cuo $$5) {
      if (!$$0.gw()) {
         return false;
      } else {
         jm<dfw> $$6 = $$1.c();
         dtb<dfw, dta> $$7 = $$6.a().l();
         Collection<dud<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, wy.a(this.a() + ".empty", $$6.g()));
            return false;
         } else {
            cxh $$9 = $$5.a(kq.L);
            if ($$9 == null) {
               return false;
            } else {
               dud<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dta $$11 = a($$1, $$10, $$0.fO());
                  $$2.a($$3, $$11, 18);
                  a($$0, wy.a(this.a() + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fO());
                  $$5.b(kq.L, $$9.a($$6, $$10));
                  a($$0, wy.a(this.a() + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dta a(dta $$0, dud<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ad.b($$0, $$1) : ad.a($$0, $$1);
   }

   private static void a(cmv $$0, wy $$1) {
      ((aqu)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dta $$0, dud<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
