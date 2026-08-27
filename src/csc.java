import java.util.Collection;
import javax.annotation.Nullable;

public class csc extends ctj {
   public csc(ctj.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(drb $$0, dax $$1, io $$2, clw $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bpt.a));
      }

      return false;
   }

   @Override
   public bpu a(cxb $$0) {
      clw $$1 = $$0.o();
      dax $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         io $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bpu.e;
         }
      }

      return bpu.a($$2.B);
   }

   private boolean a(clw $$0, drb $$1, day $$2, io $$3, boolean $$4, cto $$5) {
      if (!$$0.gz()) {
         return false;
      } else {
         ix<ddy> $$6 = $$1.c();
         drc<ddy, drb> $$7 = $$6.a().m();
         Collection<dse<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, wx.a(this.a() + ".empty", $$6.g()));
            return false;
         } else {
            cwf $$9 = $$5.a(kb.K);
            if ($$9 == null) {
               return false;
            } else {
               dse<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  drb $$11 = a($$1, $$10, $$0.fR());
                  $$2.a($$3, $$11, 18);
                  a($$0, wx.a(this.a() + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fR());
                  $$5.b(kb.K, $$9.a($$6, $$10));
                  a($$0, wx.a(this.a() + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> drb a(drb $$0, dse<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(clw $$0, wx $$1) {
      ((aqn)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(drb $$0, dse<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
