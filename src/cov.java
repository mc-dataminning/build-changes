import com.google.common.collect.Lists;
import java.util.List;

public class cov extends cpd {
   public cov(cpb $$0) {
      super($$0);
   }

   public boolean a(cia $$0, csy $$1) {
      cmh $$2 = cmh.f;
      List<cmh> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof ckz) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.d() instanceof ckw)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public cmh a(cia $$0, is $$1) {
      List<ckw> $$2 = Lists.newArrayList();
      cmh $$3 = cmh.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cmc $$6 = $$5.d();
            if ($$6 instanceof ckz) {
               if (!$$3.b()) {
                  return cmh.f;
               }

               $$3 = $$5.p();
            } else {
               if (!($$6 instanceof ckw)) {
                  return cmh.f;
               }

               $$2.add((ckw)$$6);
            }
         }
      }

      return !$$3.b() && !$$2.isEmpty() ? ckz.a($$3, $$2) : cmh.f;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cpp<?> ar_() {
      return cpp.c;
   }
}
