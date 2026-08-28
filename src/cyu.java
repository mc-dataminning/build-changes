import java.util.Collection;
import javax.annotation.Nullable;

public class cyu extends czw {
   public cyu(czw.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(daa $$0, ebg $$1, djz $$2, iw $$3, bxw $$4) {
      if (!$$2.C && $$4 instanceof crz $$5) {
         this.a($$5, $$1, $$2, $$3, false, $$0);
      }

      return false;
   }

   @Override
   public but a(ddv $$0) {
      crz $$1 = $$0.o();
      djz $$2 = $$0.q();
      if (!$$2.C && $$1 != null) {
         iw $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return but.d;
         }
      }

      return but.a;
   }

   private boolean a(crz $$0, ebg $$1, dka $$2, iw $$3, boolean $$4, daa $$5) {
      if (!$$0.gG()) {
         return false;
      } else {
         jg<dne> $$6 = $$1.c();
         ebh<dne, ebg> $$7 = $$6.a().l();
         Collection<ecj<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, xc.a(this.n + ".empty", $$6.g()));
            return false;
         } else {
            dcm $$9 = $$5.a(kl.X);
            if ($$9 == null) {
               return false;
            } else {
               ecj<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  ebg $$11 = a($$1, $$10, $$0.fY());
                  $$2.a($$3, $$11, 18);
                  a($$0, xc.a(this.n + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fY());
                  $$5.b(kl.X, $$9.a($$6, $$10));
                  a($$0, xc.a(this.n + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> ebg a(ebg $$0, ecj<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ag.b($$0, $$1) : ag.a($$0, $$1);
   }

   private static void a(crz $$0, xc $$1) {
      ((arv)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(ebg $$0, ecj<T> $$1) {
      return $$1.b($$0.c($$1));
   }
}
