import java.util.Collection;
import javax.annotation.Nullable;

public class cse extends ctl {
   public cse(ctl.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(drd $$0, daz $$1, io $$2, cly $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bpv.a));
      }

      return false;
   }

   @Override
   public bpw a(cxd $$0) {
      cly $$1 = $$0.o();
      daz $$2 = $$0.q();
      if (!$$2.B && $$1 != null) {
         io $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bpw.e;
         }
      }

      return bpw.a($$2.B);
   }

   private boolean a(cly $$0, drd $$1, dba $$2, io $$3, boolean $$4, ctq $$5) {
      if (!$$0.gz()) {
         return false;
      } else {
         ix<dea> $$6 = $$1.c();
         dre<dea, drd> $$7 = $$6.a().l();
         Collection<dsg<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, wx.a(this.a() + ".empty", $$6.g()));
            return false;
         } else {
            cwh $$9 = $$5.a(kb.K);
            if ($$9 == null) {
               return false;
            } else {
               dsg<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  drd $$11 = a($$1, $$10, $$0.fR());
                  $$2.a($$3, $$11, 18);
                  a($$0, wx.a(this.a() + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.fR());
                  $$5.b(kb.K, $$9.a($$6, $$10));
                  a($$0, wx.a(this.a() + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> drd a(drd $$0, dsg<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ac.b($$0, $$1) : ac.a($$0, $$1);
   }

   private static void a(cly $$0, wx $$1) {
      ((aqo)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(drd $$0, dsg<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
