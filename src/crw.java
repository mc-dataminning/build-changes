import com.google.common.collect.Lists;
import java.util.List;

public class crw extends crt {
   private static final cry a = cry.a(cpc.ur);

   public crw(crr $$0) {
      super($$0);
   }

   public boolean a(ckr $$0, cvn $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         coz $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cno) {
               $$2 = true;
            } else {
               if (!a.a($$5)) {
                  return false;
               }

               if ($$3) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$3 && $$2;
   }

   public coz a(ckr $$0, iw $$1) {
      List<Integer> $$2 = Lists.newArrayList();
      coz $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         coz $$5 = $$0.a($$4);
         cou $$6 = $$5.d();
         if ($$6 instanceof cno) {
            $$2.add(((cno)$$6).d().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a("Explosion").b("FadeColors", $$2);
         return $$3;
      } else {
         return coz.h;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public csf<?> at_() {
      return csf.i;
   }
}
