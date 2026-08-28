import java.util.Collection;
import javax.annotation.Nullable;

public class ctd extends cul {
   public ctd(cul.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dtc $$0, dcw $$1, jd $$2, cmx $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bqq.a));
      }

      return false;
   }

   @Override
   public bqr a(cyf $$0) {
      cmx $$1 = $$0.o();
      dcw $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         jd $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bqr.f;
         }
      }

      return bqr.a($$2.B);
   }

   private boolean a(cmx $$0, dtc $$1, dcx $$2, jd $$3, boolean $$4, cuq $$5) {
      if (!$$0.gv()) {
         return false;
      } else {
         jm<dfy> $$6 = $$1.c();
         dtd<dfy, dtc> $$7 = $$6.a().l();
         Collection<duf<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, wz.a(this.a() + ".empty", $$6.g()));
            return false;
         } else {
            cxj $$9 = $$5.a(kq.L);
            if ($$9 == null) {
               return false;
            } else {
               duf<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dtc $$11 = a($$1, $$10, $$0.fN());
                  $$2.a($$3, $$11, 18);
                  a($$0, wz.a(this.a() + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fN());
                  $$5.b(kq.L, $$9.a($$6, $$10));
                  a($$0, wz.a(this.a() + ".select", $$10.f(), a($$1, $$10)));
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

   private static void a(cmx $$0, wz $$1) {
      ((aqv)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dtc $$0, duf<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
