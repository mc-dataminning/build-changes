import java.util.Collection;
import javax.annotation.Nullable;

public class cso extends ctv {
   public cso(ctv.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dsh $$0, dcd $$1, ja $$2, cmh $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bqc.a));
      }

      return false;
   }

   @Override
   public bqd a(cxm $$0) {
      cmh $$1 = $$0.o();
      dcd $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         ja $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bqd.f;
         }
      }

      return bqd.a($$2.B);
   }

   private boolean a(cmh $$0, dsh $$1, dce $$2, ja $$3, boolean $$4, cua $$5) {
      if (!$$0.gv()) {
         return false;
      } else {
         jj<dff> $$6 = $$1.c();
         dsi<dff, dsh> $$7 = $$6.a().l();
         Collection<dtk<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, wu.a(this.a() + ".empty", $$6.g()));
            return false;
         } else {
            cwq $$9 = $$5.a(kn.L);
            if ($$9 == null) {
               return false;
            } else {
               dtk<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dsh $$11 = a($$1, $$10, $$0.fN());
                  $$2.a($$3, $$11, 18);
                  a($$0, wu.a(this.a() + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fN());
                  $$5.b(kn.L, $$9.a($$6, $$10));
                  a($$0, wu.a(this.a() + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dsh a(dsh $$0, dtk<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cmh $$0, wu $$1) {
      ((aql)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dsh $$0, dtk<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
