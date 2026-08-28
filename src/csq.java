import java.util.Collection;
import javax.annotation.Nullable;

public class csq extends ctx {
   public csq(ctx.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dsk $$0, dcf $$1, ja $$2, cmk $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bqf.a));
      }

      return false;
   }

   @Override
   public bqg a(cxo $$0) {
      cmk $$1 = $$0.o();
      dcf $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         ja $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bqg.f;
         }
      }

      return bqg.a($$2.B);
   }

   private boolean a(cmk $$0, dsk $$1, dcg $$2, ja $$3, boolean $$4, cuc $$5) {
      if (!$$0.gw()) {
         return false;
      } else {
         jj<dfh> $$6 = $$1.c();
         dsl<dfh, dsk> $$7 = $$6.a().l();
         Collection<dtn<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, wu.a(this.a() + ".empty", $$6.g()));
            return false;
         } else {
            cws $$9 = $$5.a(kn.L);
            if ($$9 == null) {
               return false;
            } else {
               dtn<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dsk $$11 = a($$1, $$10, $$0.fO());
                  $$2.a($$3, $$11, 18);
                  a($$0, wu.a(this.a() + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fO());
                  $$5.b(kn.L, $$9.a($$6, $$10));
                  a($$0, wu.a(this.a() + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dsk a(dsk $$0, dtn<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cmk $$0, wu $$1) {
      ((aqn)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dsk $$0, dtn<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
