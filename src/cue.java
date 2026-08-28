import java.util.Collection;
import javax.annotation.Nullable;

public class cue extends cvk {
   public cue(cvk.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(duo $$0, deg $$1, je $$2, cnu $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bro.a));
      }

      return false;
   }

   @Override
   public brp a(czm $$0) {
      cnu $$1 = $$0.o();
      deg $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         je $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return brp.d;
         }
      }

      return brp.a;
   }

   private boolean a(cnu $$0, duo $$1, deh $$2, je $$3, boolean $$4, cvp $$5) {
      if (!$$0.gz()) {
         return false;
      } else {
         jn<dhj> $$6 = $$1.c();
         dup<dhj, duo> $$7 = $$6.a().n();
         Collection<dvr<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, xd.a(this.a() + ".empty", $$6.g()));
            return false;
         } else {
            cyg $$9 = $$5.a(kr.Q);
            if ($$9 == null) {
               return false;
            } else {
               dvr<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  duo $$11 = a($$1, $$10, $$0.fS());
                  $$2.a($$3, $$11, 18);
                  a($$0, xd.a(this.a() + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fS());
                  $$5.b(kr.Q, $$9.a($$6, $$10));
                  a($$0, xd.a(this.a() + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> duo a(duo $$0, dvr<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ad.b($$0, $$1) : ad.a($$0, $$1);
   }

   private static void a(cnu $$0, xd $$1) {
      ((ari)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(duo $$0, dvr<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
