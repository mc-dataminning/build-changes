import com.google.common.collect.Lists;
import java.util.List;

public class cpl extends cpt {
   public cpl(cpr $$0) {
      super($$0);
   }

   public boolean a(ciq $$0, cto $$1) {
      cmx $$2 = cmx.f;
      List<cmx> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmx $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof clp) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.d() instanceof clm)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public cmx a(ciq $$0, iu $$1) {
      List<clm> $$2 = Lists.newArrayList();
      cmx $$3 = cmx.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmx $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cms $$6 = $$5.d();
            if ($$6 instanceof clp) {
               if (!$$3.b()) {
                  return cmx.f;
               }

               $$3 = $$5.p();
            } else {
               if (!($$6 instanceof clm)) {
                  return cmx.f;
               }

               $$2.add((clm)$$6);
            }
         }
      }

      return !$$3.b() && !$$2.isEmpty() ? clp.a($$3, $$2) : cmx.f;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cqf<?> ar_() {
      return cqf.c;
   }
}
