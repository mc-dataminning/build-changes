import java.util.Collection;
import javax.annotation.Nullable;

public class cwc extends cxg {
   public cwc(cxg.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxn $$0, dha $$1, jh $$2, cps $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(btd.a));
      }

      return false;
   }

   @Override
   public bte a(dbd $$0) {
      cps $$1 = $$0.o();
      dha $$2 = $$0.q();
      if (!$$2.C && $$1 != null) {
         jh $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bte.d;
         }
      }

      return bte.a;
   }

   private boolean a(cps $$0, dxn $$1, dhb $$2, jh $$3, boolean $$4, cxk $$5) {
      if (!$$0.gE()) {
         return false;
      } else {
         jq<dke> $$6 = $$1.c();
         dxo<dke, dxn> $$7 = $$6.a().l();
         Collection<dyp<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, xv.a(this.k + ".empty", $$6.g()));
            return false;
         } else {
            czx $$9 = $$5.a(ku.V);
            if ($$9 == null) {
               return false;
            } else {
               dyp<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dxn $$11 = a($$1, $$10, $$0.fW());
                  $$2.a($$3, $$11, 18);
                  a($$0, xv.a(this.k + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fW());
                  $$5.b(ku.V, $$9.a($$6, $$10));
                  a($$0, xv.a(this.k + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dxn a(dxn $$0, dyp<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ae.b($$0, $$1) : ae.a($$0, $$1);
   }

   private static void a(cps $$0, xv $$1) {
      ((asi)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dxn $$0, dyp<T> $$1) {
      return $$1.b($$0.c($$1));
   }
}
