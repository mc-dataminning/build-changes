import com.google.common.collect.Lists;
import java.util.List;

public class clk extends cls {
   public clk(aer $$0, clq $$1) {
      super($$0, $$1);
   }

   public boolean a(cer $$0, cpl $$1) {
      cix $$2 = cix.b;
      List<cix> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cix $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof chp) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.d() instanceof chm)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public cix a(cer $$0, hs $$1) {
      List<chm> $$2 = Lists.newArrayList();
      cix $$3 = cix.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cix $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cis $$6 = $$5.d();
            if ($$6 instanceof chp) {
               if (!$$3.b()) {
                  return cix.b;
               }

               $$3 = $$5.p();
            } else {
               if (!($$6 instanceof chm)) {
                  return cix.b;
               }

               $$2.add((chm)$$6);
            }
         }
      }

      return !$$3.b() && !$$2.isEmpty() ? chp.a($$3, $$2) : cix.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmc<?> ai_() {
      return cmc.c;
   }
}
