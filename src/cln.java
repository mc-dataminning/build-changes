import com.google.common.collect.Lists;
import java.util.List;

public class cln extends clw {
   public cln(clt $$0) {
      super($$0);
   }

   public boolean a(ceu $$0, cpq $$1) {
      cja $$2 = cja.b;
      List<cja> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cja $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof chs) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.d() instanceof chp)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public cja a(ceu $$0, hu $$1) {
      List<chp> $$2 = Lists.newArrayList();
      cja $$3 = cja.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cja $$5 = $$0.a($$4);
         if (!$$5.b()) {
            civ $$6 = $$5.d();
            if ($$6 instanceof chs) {
               if (!$$3.b()) {
                  return cja.b;
               }

               $$3 = $$5.p();
            } else {
               if (!($$6 instanceof chp)) {
                  return cja.b;
               }

               $$2.add((chp)$$6);
            }
         }
      }

      return !$$3.b() && !$$2.isEmpty() ? chs.a($$3, $$2) : cja.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmh<?> ai_() {
      return cmh.c;
   }
}
