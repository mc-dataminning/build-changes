import com.google.common.collect.Lists;
import java.util.List;

public class cly extends cmh {
   public cly(cme $$0) {
      super($$0);
   }

   public boolean a(cff $$0, cqb $$1) {
      cjl $$2 = cjl.b;
      List<cjl> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjl $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cid) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.d() instanceof cia)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public cjl a(cff $$0, hr $$1) {
      List<cia> $$2 = Lists.newArrayList();
      cjl $$3 = cjl.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjl $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cjg $$6 = $$5.d();
            if ($$6 instanceof cid) {
               if (!$$3.b()) {
                  return cjl.b;
               }

               $$3 = $$5.p();
            } else {
               if (!($$6 instanceof cia)) {
                  return cjl.b;
               }

               $$2.add((cia)$$6);
            }
         }
      }

      return !$$3.b() && !$$2.isEmpty() ? cid.a($$3, $$2) : cjl.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cms<?> an_() {
      return cms.c;
   }
}
