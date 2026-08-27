import java.util.Collection;
import javax.annotation.Nullable;

public class ckq extends cmc {
   public ckq(cmc.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cmh $$0) {
      return true;
   }

   @Override
   public boolean a(dip $$0, csy $$1, hv $$2, cer $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bjk.a));
      }

      return false;
   }

   @Override
   public bjl a(cos $$0) {
      cer $$1 = $$0.o();
      csy $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         hv $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bjl.e;
         }
      }

      return bjl.a($$2.B);
   }

   private boolean a(cer $$0, dip $$1, csz $$2, hv $$3, boolean $$4, cmh $$5) {
      if (!$$0.gp()) {
         return false;
      } else {
         cvz $$6 = $$1.b();
         diq<cvz, dip> $$7 = $$6.n();
         Collection<djs<?>> $$8 = $$7.d();
         String $$9 = kb.e.b($$6).toString();
         if ($$8.isEmpty()) {
            a($$0, vb.a(this.a() + ".empty", $$9));
            return false;
         } else {
            sj $$10 = $$5.a("DebugProperty");
            String $$11 = $$10.l($$9);
            djs<?> $$12 = $$7.a($$11);
            if ($$4) {
               if ($$12 == null) {
                  $$12 = $$8.iterator().next();
               }

               dip $$13 = a($$1, $$12, $$0.fI());
               $$2.a($$3, $$13, 18);
               a($$0, vb.a(this.a() + ".update", $$12.f(), a($$13, $$12)));
            } else {
               $$12 = a($$8, $$12, $$0.fI());
               String $$14 = $$12.f();
               $$10.a($$9, $$14);
               a($$0, vb.a(this.a() + ".select", $$14, a($$1, $$12)));
            }

            return true;
         }
      }
   }

   private static <T extends Comparable<T>> dip a(dip $$0, djs<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cer $$0, vb $$1) {
      ((amq)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dip $$0, djs<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
