import com.google.common.collect.Lists;
import java.util.List;

public class crp extends crx {
   public crp(crv $$0) {
      super($$0);
   }

   public boolean a(ckv $$0, cvr $$1) {
      cpd $$2 = cpd.h;
      List<cpd> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpd $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cnv) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.d() instanceof cns)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public cpd a(ckv $$0, iw $$1) {
      List<cns> $$2 = Lists.newArrayList();
      cpd $$3 = cpd.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpd $$5 = $$0.a($$4);
         if (!$$5.b()) {
            coy $$6 = $$5.d();
            if ($$6 instanceof cnv) {
               if (!$$3.b()) {
                  return cpd.h;
               }

               $$3 = $$5.q();
            } else {
               if (!($$6 instanceof cns)) {
                  return cpd.h;
               }

               $$2.add((cns)$$6);
            }
         }
      }

      return !$$3.b() && !$$2.isEmpty() ? cnv.a($$3, $$2) : cpd.h;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public csj<?> at_() {
      return csj.c;
   }
}
