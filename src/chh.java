import java.util.Collection;
import javax.annotation.Nullable;

public class chh extends cit {
   public chh(cit.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(ciy $$0) {
      return true;
   }

   @Override
   public boolean a(dfa $$0, cpm $$1, gu $$2, cbn $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bgp.a));
      }

      return false;
   }

   @Override
   public bgq a(cli $$0) {
      cbn $$1 = $$0.o();
      cpm $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         gu $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bgq.e;
         }
      }

      return bgq.a($$2.B);
   }

   private boolean a(cbn $$0, dfa $$1, cpn $$2, gu $$3, boolean $$4, ciy $$5) {
      if (!$$0.gn()) {
         return false;
      } else {
         csm $$6 = $$1.b();
         dfb<csm, dfa> $$7 = $$6.l();
         Collection<dgd<?>> $$8 = $$7.d();
         String $$9 = jb.f.b($$6).toString();
         if ($$8.isEmpty()) {
            a($$0, tf.a(this.a() + ".empty", $$9));
            return false;
         } else {
            qr $$10 = $$5.a("DebugProperty");
            String $$11 = $$10.l($$9);
            dgd<?> $$12 = $$7.a($$11);
            if ($$4) {
               if ($$12 == null) {
                  $$12 = $$8.iterator().next();
               }

               dfa $$13 = a($$1, $$12, $$0.fG());
               $$2.a($$3, $$13, 18);
               a($$0, tf.a(this.a() + ".update", $$12.f(), a($$13, $$12)));
            } else {
               $$12 = a($$8, $$12, $$0.fG());
               String $$14 = $$12.f();
               $$10.a($$9, $$14);
               a($$0, tf.a(this.a() + ".select", $$14, a($$1, $$12)));
            }

            return true;
         }
      }
   }

   private static <T extends Comparable<T>> dfa a(dfa $$0, dgd<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cbn $$0, tf $$1) {
      ((akl)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dfa $$0, dgd<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
