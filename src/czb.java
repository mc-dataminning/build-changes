import com.google.common.collect.Lists;
import java.util.List;

public class czb extends czk {
   public czb(czh $$0) {
      super($$0);
   }

   public boolean a(czi $$0, dds $$1) {
      cvl $$2 = cvl.k;
      List<cvl> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvl $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axb.bD)) {
               if (!$$2.f()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.h() instanceof cuf)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.f() && !$$3.isEmpty();
   }

   public cvl a(czi $$0, jp.a $$1) {
      List<cuf> $$2 = Lists.newArrayList();
      cvl $$3 = cvl.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvl $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axb.bD)) {
               if (!$$3.f()) {
                  return cvl.k;
               }

               $$3 = $$5.u();
            } else {
               if (!($$5.h() instanceof cuf $$6)) {
                  return cvl.k;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? cyd.a($$3, $$2) : cvl.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public czy<?> as_() {
      return czy.c;
   }
}
