import com.google.common.collect.Lists;
import java.util.List;

public class dbg extends dbq {
   public dbg(dbn $$0) {
      super($$0);
   }

   public boolean a(dbo $$0, dha $$1) {
      cxk $$2 = cxk.k;
      List<cxk> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxk $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(ayd.bR)) {
               if (!$$2.f()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.h() instanceof cwi)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.f() && !$$3.isEmpty();
   }

   public cxk a(dbo $$0, js.a $$1) {
      List<cwi> $$2 = Lists.newArrayList();
      cxk $$3 = cxk.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxk $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(ayd.bR)) {
               if (!$$3.f()) {
                  return cxk.k;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof cwi $$6)) {
                  return cxk.k;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? czy.a($$3, $$2) : cxk.k;
   }

   @Override
   public dci<dbg> a() {
      return dci.c;
   }
}
