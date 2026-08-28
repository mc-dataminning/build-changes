import java.util.Collection;
import javax.annotation.Nullable;

public class ctc extends cuj {
   public ctc(cuj.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dsb $$0, dbx $$1, iz $$2, cmw $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bqs.a));
      }

      return false;
   }

   @Override
   public bqt a(cyb $$0) {
      cmw $$1 = $$0.o();
      dbx $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         iz $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bqt.f;
         }
      }

      return bqt.a($$2.B);
   }

   private boolean a(cmw $$0, dsb $$1, dby $$2, iz $$3, boolean $$4, cuo $$5) {
      if (!$$0.gz()) {
         return false;
      } else {
         ji<dey> $$6 = $$1.c();
         dsc<dey, dsb> $$7 = $$6.a().l();
         Collection<dte<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, xo.a(this.a() + ".empty", $$6.g()));
            return false;
         } else {
            cxf $$9 = $$5.a(km.L);
            if ($$9 == null) {
               return false;
            } else {
               dte<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dsb $$11 = a($$1, $$10, $$0.fR());
                  $$2.a($$3, $$11, 18);
                  a($$0, xo.a(this.a() + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fR());
                  $$5.b(km.L, $$9.a($$6, $$10));
                  a($$0, xo.a(this.a() + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dsb a(dsb $$0, dte<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cmw $$0, xo $$1) {
      ((arf)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dsb $$0, dte<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
