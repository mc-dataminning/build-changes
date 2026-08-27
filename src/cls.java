import com.google.common.collect.Lists;
import java.util.List;

public class cls extends cmb {
   public cls(cly $$0) {
      super($$0);
   }

   public boolean a(cez $$0, cpv $$1) {
      cjf $$2 = cjf.b;
      List<cjf> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjf $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof chx) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.d() instanceof chu)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public cjf a(cez $$0, hr $$1) {
      List<chu> $$2 = Lists.newArrayList();
      cjf $$3 = cjf.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjf $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cja $$6 = $$5.d();
            if ($$6 instanceof chx) {
               if (!$$3.b()) {
                  return cjf.b;
               }

               $$3 = $$5.p();
            } else {
               if (!($$6 instanceof chu)) {
                  return cjf.b;
               }

               $$2.add((chu)$$6);
            }
         }
      }

      return !$$3.b() && !$$2.isEmpty() ? chx.a($$3, $$2) : cjf.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmm<?> an_() {
      return cmm.c;
   }
}
