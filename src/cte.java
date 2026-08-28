import java.util.Collection;
import javax.annotation.Nullable;

public class cte extends cul {
   public cte(cul.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dsd $$0, dbz $$1, iz $$2, cmy $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bqu.a));
      }

      return false;
   }

   @Override
   public bqv a(cyd $$0) {
      cmy $$1 = $$0.o();
      dbz $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         iz $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bqv.f;
         }
      }

      return bqv.a($$2.B);
   }

   private boolean a(cmy $$0, dsd $$1, dca $$2, iz $$3, boolean $$4, cuq $$5) {
      if (!$$0.gz()) {
         return false;
      } else {
         ji<dfa> $$6 = $$1.c();
         dse<dfa, dsd> $$7 = $$6.a().l();
         Collection<dtg<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, xp.a(this.a() + ".empty", $$6.g()));
            return false;
         } else {
            cxh $$9 = $$5.a(km.L);
            if ($$9 == null) {
               return false;
            } else {
               dtg<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dsd $$11 = a($$1, $$10, $$0.fR());
                  $$2.a($$3, $$11, 18);
                  a($$0, xp.a(this.a() + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fR());
                  $$5.b(km.L, $$9.a($$6, $$10));
                  a($$0, xp.a(this.a() + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dsd a(dsd $$0, dtg<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cmy $$0, xp $$1) {
      ((arg)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dsd $$0, dtg<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
