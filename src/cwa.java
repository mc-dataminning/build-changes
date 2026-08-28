import java.util.Collection;
import javax.annotation.Nullable;

public class cwa extends cxd {
   public cwa(cxd.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cxh $$0, dxq $$1, dgz $$2, ji $$3, bvy $$4) {
      if (!$$2.C && $$4 instanceof cpr $$5) {
         this.a($$5, $$1, $$2, $$3, false, $$0);
      }

      return false;
   }

   @Override
   public bsy a(daz $$0) {
      cpr $$1 = $$0.o();
      dgz $$2 = $$0.q();
      if (!$$2.C && $$1 != null) {
         ji $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bsy.d;
         }
      }

      return bsy.a;
   }

   private boolean a(cpr $$0, dxq $$1, dha $$2, ji $$3, boolean $$4, cxh $$5) {
      if (!$$0.gI()) {
         return false;
      } else {
         jr<dke> $$6 = $$1.c();
         dxr<dke, dxq> $$7 = $$6.a().l();
         Collection<dyt<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, wp.a(this.m + ".empty", $$6.g()));
            return false;
         } else {
            czs $$9 = $$5.a(kv.X);
            if ($$9 == null) {
               return false;
            } else {
               dyt<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dxq $$11 = a($$1, $$10, $$0.ga());
                  $$2.a($$3, $$11, 18);
                  a($$0, wp.a(this.m + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.ga());
                  $$5.b(kv.X, $$9.a($$6, $$10));
                  a($$0, wp.a(this.m + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dxq a(dxq $$0, dyt<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? af.b($$0, $$1) : af.a($$0, $$1);
   }

   private static void a(cpr $$0, wp $$1) {
      ((are)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dxq $$0, dyt<T> $$1) {
      return $$1.b($$0.c($$1));
   }
}
