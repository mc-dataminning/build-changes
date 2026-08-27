import com.google.common.collect.Lists;
import java.util.List;

public class crl extends crt {
   public crl(crr $$0) {
      super($$0);
   }

   public boolean a(ckr $$0, cvn $$1) {
      coz $$2 = coz.h;
      List<coz> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         coz $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cnr) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.d() instanceof cno)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public coz a(ckr $$0, iw $$1) {
      List<cno> $$2 = Lists.newArrayList();
      coz $$3 = coz.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         coz $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cou $$6 = $$5.d();
            if ($$6 instanceof cnr) {
               if (!$$3.b()) {
                  return coz.h;
               }

               $$3 = $$5.q();
            } else {
               if (!($$6 instanceof cno)) {
                  return coz.h;
               }

               $$2.add((cno)$$6);
            }
         }
      }

      return !$$3.b() && !$$2.isEmpty() ? cnr.a($$3, $$2) : coz.h;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public csf<?> at_() {
      return csf.c;
   }
}
