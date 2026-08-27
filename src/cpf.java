import com.google.common.collect.Lists;
import java.util.List;

public class cpf extends cpn {
   public cpf(cpl $$0) {
      super($$0);
   }

   public boolean a(cik $$0, cti $$1) {
      cmr $$2 = cmr.f;
      List<cmr> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmr $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof clj) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.d() instanceof clg)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public cmr a(cik $$0, iu $$1) {
      List<clg> $$2 = Lists.newArrayList();
      cmr $$3 = cmr.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmr $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cmm $$6 = $$5.d();
            if ($$6 instanceof clj) {
               if (!$$3.b()) {
                  return cmr.f;
               }

               $$3 = $$5.p();
            } else {
               if (!($$6 instanceof clg)) {
                  return cmr.f;
               }

               $$2.add((clg)$$6);
            }
         }
      }

      return !$$3.b() && !$$2.isEmpty() ? clj.a($$3, $$2) : cmr.f;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cpz<?> ar_() {
      return cpz.c;
   }
}
