import com.google.common.collect.Lists;
import java.util.List;

public class cxg extends cxo {
   public cxg(cxm $$0) {
      super($$0);
   }

   public boolean a(cpl $$0, daz $$1) {
      ctq $$2 = ctq.i;
      List<ctq> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ctq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awf.bz)) {
               if (!$$2.e()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.g() instanceof csk)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.e() && !$$3.isEmpty();
   }

   public ctq a(cpl $$0, iz.a $$1) {
      List<csk> $$2 = Lists.newArrayList();
      ctq $$3 = ctq.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ctq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awf.bz)) {
               if (!$$3.e()) {
                  return ctq.i;
               }

               $$3 = $$5.s();
            } else {
               if (!($$5.g() instanceof csk $$6)) {
                  return ctq.i;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.e() && !$$2.isEmpty() ? cwi.a($$3, $$2) : ctq.i;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cya<?> ap_() {
      return cya.c;
   }
}
