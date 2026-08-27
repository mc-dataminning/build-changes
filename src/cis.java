import java.util.Collection;
import javax.annotation.Nullable;

public class cis extends cke {
   public cis(cke.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(ckj $$0) {
      return true;
   }

   @Override
   public boolean a(dgb $$0, cqz $$1, ht $$2, ccx $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bia.a));
      }

      return false;
   }

   @Override
   public bib a(cmt $$0) {
      ccx $$1 = $$0.o();
      cqz $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         ht $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bib.e;
         }
      }

      return bib.a($$2.B);
   }

   private boolean a(ccx $$0, dgb $$1, cra $$2, ht $$3, boolean $$4, ckj $$5) {
      if (!$$0.gp()) {
         return false;
      } else {
         cua $$6 = $$1.b();
         dgc<cua, dgb> $$7 = $$6.n();
         Collection<dhe<?>> $$8 = $$7.d();
         String $$9 = jy.f.b($$6).toString();
         if ($$8.isEmpty()) {
            a($$0, ui.a(this.a() + ".empty", $$9));
            return false;
         } else {
            rt $$10 = $$5.a("DebugProperty");
            String $$11 = $$10.l($$9);
            dhe<?> $$12 = $$7.a($$11);
            if ($$4) {
               if ($$12 == null) {
                  $$12 = $$8.iterator().next();
               }

               dgb $$13 = a($$1, $$12, $$0.fI());
               $$2.a($$3, $$13, 18);
               a($$0, ui.a(this.a() + ".update", $$12.f(), a($$13, $$12)));
            } else {
               $$12 = a($$8, $$12, $$0.fI());
               String $$14 = $$12.f();
               $$10.a($$9, $$14);
               a($$0, ui.a(this.a() + ".select", $$14, a($$1, $$12)));
            }

            return true;
         }
      }
   }

   private static <T extends Comparable<T>> dgb a(dgb $$0, dhe<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(ccx $$0, ui $$1) {
      ((alr)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dgb $$0, dhe<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
