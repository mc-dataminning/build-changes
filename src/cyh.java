import com.google.common.collect.Lists;
import java.util.List;

public class cyh extends cyp {
   public cyh(cyn $$0) {
      super($$0);
   }

   public boolean a(cqm $$0, dca $$1) {
      cur $$2 = cur.l;
      List<cur> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cur $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awy.by)) {
               if (!$$2.e()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.g() instanceof ctl)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.e() && !$$3.isEmpty();
   }

   public cur a(cqm $$0, jk.a $$1) {
      List<ctl> $$2 = Lists.newArrayList();
      cur $$3 = cur.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cur $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awy.by)) {
               if (!$$3.e()) {
                  return cur.l;
               }

               $$3 = $$5.s();
            } else {
               if (!($$5.g() instanceof ctl $$6)) {
                  return cur.l;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.e() && !$$2.isEmpty() ? cxj.a($$3, $$2) : cur.l;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public czb<?> ao_() {
      return czb.c;
   }
}
