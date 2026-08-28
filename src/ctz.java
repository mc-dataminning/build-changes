import java.util.Collection;
import javax.annotation.Nullable;

public class ctz extends cvg {
   public ctz(cvg.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dua $$0, dds $$1, je $$2, cnp $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(brj.a));
      }

      return false;
   }

   @Override
   public brk a(cyy $$0) {
      cnp $$1 = $$0.o();
      dds $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         je $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return brk.d;
         }
      }

      return brk.a;
   }

   private boolean a(cnp $$0, dua $$1, ddt $$2, je $$3, boolean $$4, cvl $$5) {
      if (!$$0.gz()) {
         return false;
      } else {
         jn<dgv> $$6 = $$1.c();
         dub<dgv, dua> $$7 = $$6.a().l();
         Collection<dvd<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, xd.a(this.a() + ".empty", $$6.g()));
            return false;
         } else {
            cyc $$9 = $$5.a(kr.N);
            if ($$9 == null) {
               return false;
            } else {
               dvd<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  dua $$11 = a($$1, $$10, $$0.fR());
                  $$2.a($$3, $$11, 18);
                  a($$0, xd.a(this.a() + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fR());
                  $$5.b(kr.N, $$9.a($$6, $$10));
                  a($$0, xd.a(this.a() + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> dua a(dua $$0, dvd<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ad.b($$0, $$1) : ad.a($$0, $$1);
   }

   private static void a(cnp $$0, xd $$1) {
      ((arh)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dua $$0, dvd<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
