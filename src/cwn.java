import com.google.common.collect.Lists;
import java.util.List;

public class cwn extends cwv {
   public cwn(cwt $$0) {
      super($$0);
   }

   public boolean a(cou $$0, dad $$1) {
      csz $$2 = csz.i;
      List<csz> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csz $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(avz.bz)) {
               if (!$$2.d()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.f() instanceof crt)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.d() && !$$3.isEmpty();
   }

   public csz a(cou $$0, iy.a $$1) {
      List<crt> $$2 = Lists.newArrayList();
      csz $$3 = csz.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csz $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(avz.bz)) {
               if (!$$3.d()) {
                  return csz.i;
               }

               $$3 = $$5.r();
            } else {
               if (!($$5.f() instanceof crt $$6)) {
                  return csz.i;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.d() && !$$2.isEmpty() ? cvp.a($$3, $$2) : csz.i;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cxh<?> ao_() {
      return cxh.c;
   }
}
