import java.util.Collection;
import javax.annotation.Nullable;

public class cst extends cuc {
   public cst(cuc.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dtc $$0, dca $$1, ir $$2, cly $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bpz.a));
      }

      return false;
   }

   @Override
   public bqa a(cyf $$0) {
      cly $$1 = $$0.o();
      dca $$2 = $$0.q();
      if (!$$2.C && $$1 != null) {
         ir $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bqa.e;
         }
      }

      return bqa.a($$2.C);
   }

   private boolean a(cly $$0, dtc $$1, dcb $$2, ir $$3, boolean $$4, cuh $$5) {
      if (!$$0.gK()) {
         return false;
      } else {
         ja<dfc> $$6 = $$1.c();
         dtd<dfc, dtc> $$7 = $$6.a().l();
         Collection<duf<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, xe.a(this.a() + ".empty", $$6.g()));
            return false;
         } else {
            cxh $$9 = $$5.a(ke.J);
            if ($$9 == null) {
               return false;
            } else {
               duf<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dtc $$11 = a($$1, $$10, $$0.ga());
                  $$2.a($$3, $$11, 18);
                  a($$0, xe.a(this.a() + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.ga());
                  $$5.b(ke.J, $$9.a($$6, $$10));
                  a($$0, xe.a(this.a() + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dtc a(dtc $$0, duf<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ad.b($$0, $$1) : ad.a($$0, $$1);
   }

   private static void a(cly $$0, xe $$1) {
      ((aqu)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dtc $$0, duf<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
