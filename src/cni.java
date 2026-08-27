import java.util.Collection;
import javax.annotation.Nullable;

public class cni extends cou {
   public cni(cou.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(coz $$0) {
      return true;
   }

   @Override
   public boolean a(dlf $$0, cvn $$1, hz $$2, chh $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(blt.a));
      }

      return false;
   }

   @Override
   public blu a(cri $$0) {
      chh $$1 = $$0.o();
      cvn $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         hz $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return blu.e;
         }
      }

      return blu.a($$2.B);
   }

   private boolean a(chh $$0, dlf $$1, cvo $$2, hz $$3, boolean $$4, coz $$5) {
      if (!$$0.gq()) {
         return false;
      } else {
         cyo $$6 = $$1.b();
         dlg<cyo, dlf> $$7 = $$6.n();
         Collection<dmi<?>> $$8 = $$7.d();
         String $$9 = kf.e.b($$6).toString();
         if ($$8.isEmpty()) {
            a($$0, vq.a(this.a() + ".empty", $$9));
            return false;
         } else {
            sw $$10 = $$5.a("DebugProperty");
            String $$11 = $$10.l($$9);
            dmi<?> $$12 = $$7.a($$11);
            if ($$4) {
               if ($$12 == null) {
                  $$12 = $$8.iterator().next();
               }

               dlf $$13 = a($$1, $$12, $$0.fI());
               $$2.a($$3, $$13, 18);
               a($$0, vq.a(this.a() + ".update", $$12.f(), a($$13, $$12)));
            } else {
               $$12 = a($$8, $$12, $$0.fI());
               String $$14 = $$12.f();
               $$10.a($$9, $$14);
               a($$0, vq.a(this.a() + ".select", $$14, a($$1, $$12)));
            }

            return true;
         }
      }
   }

   private static <T extends Comparable<T>> dlf a(dlf $$0, dmi<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(chh $$0, vq $$1) {
      ((aow)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(dlf $$0, dmi<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
