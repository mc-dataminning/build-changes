import java.util.Collection;
import javax.annotation.Nullable;

public class cqg extends crn {
   public cqg(crn.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpi $$0, czg $$1, id $$2, cka $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(boe.a));
      }

      return false;
   }

   @Override
   public bof a(cuz $$0) {
      cka $$1 = $$0.o();
      czg $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         id $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bof.e;
         }
      }

      return bof.a($$2.B);
   }

   private boolean a(cka $$0, dpi $$1, czh $$2, id $$3, boolean $$4, crs $$5) {
      if (!$$0.gw()) {
         return false;
      } else {
         in<dch> $$6 = $$1.c();
         dpj<dch, dpi> $$7 = $$6.a().l();
         Collection<dql<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, wi.a(this.a() + ".empty", $$6.g()));
            return false;
         } else {
            cue $$9 = $$5.a(jr.C);
            if ($$9 == null) {
               return false;
            } else {
               dql<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dpi $$11 = a($$1, $$10, $$0.fO());
                  $$2.a($$3, $$11, 18);
                  a($$0, wi.a(this.a() + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fO());
                  $$5.b(jr.C, $$9.a($$6, $$10));
                  a($$0, wi.a(this.a() + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dpi a(dpi $$0, dql<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cka $$0, wi $$1) {
      ((apv)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dpi $$0, dql<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
